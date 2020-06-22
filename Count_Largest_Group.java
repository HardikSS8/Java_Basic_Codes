class Solution {
    public int countLargestGroup(int n) {
        
        if(n <= 9) {
            return n;
        }
        
        int[] count = new int[10001];
        
        for(int i=1; i<=n; i++) {
            if(i < 9)
                count[i]++;
            else {
                int temp = 0;
                int j = i;
                while(j > 0) {
                    temp += j % 10;
                    j = j/10;
                }
                count[temp]++;
            }
        }
        
        int max = 0;
        int a = 0;
        
        for(int i=0; i<n; i++) {
            if(count[i] > max) {
                max = count[i];
                a = 1;
            }
            else if(count[i] == max)
                a++;            
        }
        
        return a;
    }
}
