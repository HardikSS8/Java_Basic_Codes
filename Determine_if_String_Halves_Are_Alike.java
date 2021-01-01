class Solution {
    
    public int count(String str) {
        
        int c = 0;
        str = str.toLowerCase();
        for(char a : str.toCharArray()) {
            if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                c++;
            }
        }
        return c;
    }
    
    public boolean halvesAreAlike(String s) {
      
        String first = s.substring(0, s.length()/2);
        String second = s.substring(s.length()/2 , s.length());
        
        return count(first) == count(second);
    }
}
