class Solution {
    public String replaceDigits(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            
            if(i % 2 != 0) {
                sb.append((char)((int)s.charAt(i-1) + Character.getNumericValue(s.charAt(i))));
            } else {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}
