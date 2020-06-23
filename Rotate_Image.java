class Solution {
    
    public int[] reverse(int[] array) {
        
        int n = array.length;
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = array[i]; 
            j = j - 1; 
        }
        
        return b;
    }
    
    public void rotate(int[][] matrix) {
        
        int N = matrix.length;
        int M = matrix[0].length;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < M; j++) { 
                 int temp = matrix[i][j]; 
                 matrix[i][j] = matrix[j][i]; 
                 matrix[j][i] = temp; 
            }
        }    
        
        for(int i=0; i<N; i++) {
            matrix[i] = reverse(matrix[i]);
        }
    }
}
