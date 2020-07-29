class Solution {
    public int[] closestDivisors(int num) {
        
        
        int min = Integer.MAX_VALUE;
        int ans1 = 0;
        int ans2 = 0;
        for(int i=1; i<=Math.sqrt(num + 1); i++) {
            
            if((num+1) % i == 0) {
                
                int sec = (num + 1) / i;
                if(min > Math.abs(sec-i)) {
                    ans1 = sec;
                    ans2 = i;
                    min = Math.abs(sec-i);
                }
            }
        }
        
        for(int i=1; i<=Math.sqrt(num + 2); i++) {
            
            if((num+2) % i == 0) {
                
                int sec = (num + 2) / i;
                if(min > Math.abs(sec-i)) {
                    ans1 = sec;
                    ans2 = i;
                    min = Math.abs(sec-i);
                }
            }
        }
        
        return new int[]{ans1, ans2};
    }
}
