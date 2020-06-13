class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();
        
        if(matrix.length == 0)
            return list;        
        
        int r_start = 0;
        int c_start = 0;
        int r_end = matrix.length - 1;
        int c_end = matrix[0].length - 1;
        
        while(r_start <= r_end && c_start <= c_end) {
                        
            for(int j=c_start; j<=c_end; j++) {
                list.add(matrix[r_start][j]);
            }
            
            for(int i=r_start+1; i<=r_end; i++) {
                list.add(matrix[i][c_end]);
            }
            
            if(r_start < r_end && c_start < c_end) {
                for(int j=c_end-1; j>c_start; j--) {
                    list.add(matrix[r_end][j]);
                }
                for(int i=r_end; i>r_start; i--) {
                    list.add(matrix[i][c_start]);
                }
            }   
            r_start++;
            c_end--;
            r_end--;
            c_start++;
        }
        return list;
    }
}
