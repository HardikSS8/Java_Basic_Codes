class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum_of_diagonal = 0;
        
        int rows = mat.length;
        int cols = mat[0].length;
        
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(i == j) {
                    sum_of_diagonal += mat[i][j];
                    System.out.println(mat[i][j]);
                }
            }
        }
        for(int i=rows-1; i>=0; i--) {
            for(int j=cols-1; j>=0; j--) {
                if(i + j == rows-1) {
                    sum_of_diagonal += mat[i][j];
                    System.out.println(mat[i][j]);
                }
            }
        }
        
        int middle = rows / 2;
        
        if(rows % 2 != 0) {
            sum_of_diagonal -= mat[middle][middle];
        }
        
        return sum_of_diagonal;
    }
}
