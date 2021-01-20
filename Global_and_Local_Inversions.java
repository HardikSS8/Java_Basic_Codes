class Solution {
    public boolean isIdealPermutation(int[] A) {
        
        int max_uptil_here = Integer.MIN_VALUE;
        
        for(int i = 0; i < A.length - 1; i++) {
            
            if(max_uptil_here > A[i+1])
                return false;
            
            max_uptil_here = Math.max(max_uptil_here, A[i]);
        }
        
        return true;
    }
}
