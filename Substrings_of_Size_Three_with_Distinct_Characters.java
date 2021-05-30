class Solution {
    
    public boolean check(String str) {
        
        Set<Character> set = new HashSet<>();
        
        for(char c : str.toCharArray()) {
            if(set.contains(c))
                return false;
            set.add(c);
        }
        
        return true;
    }
    
    public int countGoodSubstrings(String s) {
        
        int count = 0;
        
        for(int i = 0; i < s.length() - 2; i++) {
            
            String sub = s.substring(i, i + 3);
            
            if(check(sub))
                count++;
        }
        
        return count;
    }
}
