class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        
        long sum=0;
        
        List<Boolean> ans = new ArrayList<>();
        
        for(int i:A) {
            
            sum = (sum * 2) % 5 + i;
        
            if(sum % 5 == 0)
                ans.add(true);
            else 
                ans.add(false);
            
            sum %= 5;
        }
        return ans;
    }
}
