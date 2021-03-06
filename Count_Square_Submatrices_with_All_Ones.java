class Solution {
    public int countSquares(int[][] matrix) {
        
        int count = 0;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for(int i=0; i<rows; i++) {
            
            for(int j=0; j<cols; j++) {
                
                if(i == 0 || j == 0)
                    count += matrix[i][j];
                
                else if(matrix[i][j] == 1) {
                    matrix[i][j] = 1 + Math.min(matrix[i-1][j], 
                                       Math.min(matrix[i][j-1], matrix[i-1][j-1]));
                    count += matrix[i][j];
                }
            }
        }
        
        return count;
    }
}
