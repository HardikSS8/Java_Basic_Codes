class Solution {
    public int[] minOperations(String boxes) {
        
        // System.out.println(boxes.length());
        
        int[] ans = new int[boxes.length()];
        
        for(int i = 0; i < boxes.length(); i++) {
            
            int no_of_moves = 0;
            
            for(int j = 0; j < boxes.length(); j++) {
                
                if(boxes.charAt(j) == '1') {
                    no_of_moves += Math.abs(i - j);
                }
            }
            
            ans[i] = no_of_moves;
        }
        
        return ans;
    }
}
