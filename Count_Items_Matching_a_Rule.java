class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int count = 0;
        
        for(int i = 0; i < items.size(); i++) {
            
            List<String> currList = items.get(i);
                    
            if((ruleKey.equals("type") && currList.get(0).equals(ruleValue))
              || (ruleKey.equals("color") && currList.get(1).equals(ruleValue))
              || (ruleKey.equals("name") && currList.get(2).equals(ruleValue))
              ) {
                count++;
            }
        }
        return count;
    }
}
