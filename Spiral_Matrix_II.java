class Solution {
    public int[][] generateMatrix(int n) {
        
        int num = 1;
        
        int r_start = 0;
        int c_start = 0;
        int r_end = n - 1;
        int c_end = n-1;
        
        int[][] spiral = new int[n][n];
        
        while(r_start <= r_end) {
            
            for(int j=c_start; j<=c_end; j++) {
                spiral[r_start][j] = num++; 
            }
            r_start++;
            
            for(int i=r_start; i<=r_end; i++) {
                spiral[i][c_end] = num++;
            }
            c_end--;
            
            for(int j=c_end; j>=c_start; j--) {
                spiral[r_end][j] = num++;
            }
            r_end--;
            
            for(int i=r_end; i>=r_start; i--) {
                spiral[i][c_start] = num++;
            }
            c_start++;
        }
        
        return spiral;
    }
}
