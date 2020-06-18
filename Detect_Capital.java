class Solution {
    
    public boolean allCapitals(String word) {
        
        for(char c : word.toCharArray()) {
            if(c >= 'a' && c <= 'z')
                return false;
        }
        return true;
    }
    
    public boolean firstCapital(String word) {
        
        char[] c = word.toCharArray();
        
        if(c[0] >= 'a' && c[0] <= 'z')
            return false;
        
        for(int i=1; i<word.length(); i++) {
            if(c[i] >= 'A' && c[i] <= 'Z')
                return false;
        }
        return true;
    }
    
    public boolean detectCapitalUse(String word) {
        
        if(allCapitals(word))
            return true;
        if(firstCapital(word))
            return true;
        
        char[] check = word.toCharArray();
        
        for(char c : check) 
            if(c >= 'A' && c <= 'Z')
                return false;
        return true;
    }
}
