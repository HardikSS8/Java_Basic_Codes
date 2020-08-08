class Solution {
  public List<Boolean> camelMatch(String[] queries, String pattern) {
        
      List<Boolean> list = new ArrayList<>();
    
      for (String q : queries) 
          list.add(helper(q, pattern));
    
      return list;
  }
  
    private boolean helper(String query, String pattern) {
        
        int i = 0;
        int j = 0;
                
        while (i < query.length() && j < pattern.length()) {
            
            char queryC = query.charAt(i);
            char patternC = pattern.charAt(j);
            
            if (queryC == patternC) {
                i++;
                j++;
            }
            else if (Character.isUpperCase(queryC)) 
                return false;
            else
                i++;
        }
        
        while (i < query.length() && Character.isLowerCase(query.charAt(i)))
            i++;
    
        return j == pattern.length() && i == query.length();
        }
    }
