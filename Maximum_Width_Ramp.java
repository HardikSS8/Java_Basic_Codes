class Solution {
    public int maxWidthRamp(int[] A) {
        
        int max = 0;
        
        for(int i=0; i<A.length; ++i) {
            for(int j=0; j<i; ++j) {
                
                if(A[i] >= A[j]) {
                    max = Math.max(max, i-j);
                    break;
                }
            }
        }
        return max;
    }
}
