class Solution {
    
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        for (int i=k; i > 0; i--) {

            int previous = grid[grid.length - 1][grid[0].length - 1];
            
            for (int row = 0; row < grid.length; row++) {
            
                for (int col = 0; col < grid[0].length; col++) {
                
                    int temp = grid[row][col];
                    grid[row][col] = previous;
                    previous = temp;
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i=0; i<grid.length; i++) {
            List<Integer> list = new ArrayList<>();            
            for(int j=0; j<grid[0].length; j++) {
                list.add(grid[i][j]);
            }
            ans.add(list);
        }

        return ans;
    }
}
