class Solution {
    public String reverseOnlyLetters(String S) {
        
        int i = 0;
        int j = S.length() - 1;
        
        char[] rev = S.toCharArray();
        
        while(i < j) {
            if(!Character.isLetter(rev[i]))
                i++;
            
            else if(!Character.isLetter(rev[j]))
                j--;
            
            else {
                char temp = rev[i];
                rev[i] = rev[j];
                rev[j] = temp;
                i++;
                j--;
            }
        }
        
        return new String(rev);
    }
}
