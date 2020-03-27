class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        
        HashSet<Integer> ans = new HashSet<Integer>();
        
        for(int i = 0; i <= Math.sqrt(bound); i++) {
            
            for(int j = 0; j <= Math.sqrt(bound); j++) {
                
                double a = Math.pow(x,i) + Math.pow(y,j);            
                if(a <= bound)
                    ans.add((int)a);
                else
                    continue;
            }
        }
        List<Integer> ans_list = new ArrayList<Integer>(ans);
        return ans_list;
    }
}
