class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int i1 = 0;
        int i2 = 0;
        
        int j1 = word1.length() - 1;
        int j2 = word2.length() - 1;
        
        StringBuilder sb = new StringBuilder();
        
        while(i1 <= j1 && i2 <= j2) {
            
            sb.append(word1.charAt(i1));
            sb.append(word2.charAt(i2));
            
            i1++; i2++;
        }
        
        if(i1 <= j1) sb.append(word1.substring(i1, j1+1));
        if(i2 <= j2) sb.append(word2.substring(i2, j2+1));
        
        return sb.toString();
    }
}
