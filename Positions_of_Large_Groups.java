class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        
        List<List<Integer>> ans = new ArrayList();
        int i = 0, N = S.length(); 
        
        for (int j = 0; j < N; ++j) {
            
            if (j == N-1 || S.charAt(j) != S.charAt(j+1)) {
                
                
                if (j-i+1 >= 3)
                    ans.add(Arrays.asList(new Integer[]{i, j}));
                
                i = j + 1;
            }
            
            // System.out.println(S.charAt(j));
            // System.out.println("strat :" + i);
            // System.out.println("End :" + j);
            // System.out.println();
            
        }
            

        return ans;
    }
}
