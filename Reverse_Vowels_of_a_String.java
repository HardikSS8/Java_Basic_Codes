class Solution {
    
    public boolean isVowel(Character c) {
        return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u' || c == 'U');
    }
    
    public String reverseVowels(String s) {
        
        int i = 0;
        int j = s.length()-1;
        
        char[] c = s.toCharArray();
        
        while(i < j) {
            if (!isVowel(c[i])) { 
                i++; 
                continue; 
            } 
            if (!isVowel(c[j])) { 
                j--; 
                continue; 
            }
            
            char t = c[i]; 
            c[i]= c[j]; 
            c[j]= t;
            i++; 
            j--;
        }
        
        String str2 = new String(c); 
        
        return str2;
    }
}
