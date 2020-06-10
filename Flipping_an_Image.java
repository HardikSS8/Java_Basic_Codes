class Solution {
    public int[] rotate(int[] nums) {
        
        int[] b = new int[nums.length]; 
        int j = nums.length; 
        for (int i = 0; i < nums.length; i++) { 
            b[j - 1] = nums[i]; 
            j = j - 1; 
        }
        return b;
    }
    
    public int[] flip(int[] arr) {
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        return arr;
    }
    
    public int[][] flipAndInvertImage(int[][] A) {
        
        for(int i=0; i<A.length; i++) {
            A[i] = rotate(A[i]);
        }
        
        for(int i=0; i<A.length; i++) {
            A[i] = flip(A[i]);
        }
        
        return A;
    }
}
