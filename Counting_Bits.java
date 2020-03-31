class Solution {
    public int[] countBits(int num) {
        
        int[] ans = new int[num+1];
        for(int i=0; i<=num; i++) {
        
            int count = 0;
            String A = Integer.toBinaryString(i);
            
            for(int j=0; j<A.length(); j++) {
                if(A.charAt(j) == '1')
                    count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}
