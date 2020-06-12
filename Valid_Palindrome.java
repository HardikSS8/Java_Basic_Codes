class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        // System.out.println(s);
        
        String A = "";
        
        for(int i=0; i<s.length(); i++) {
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                A += s.charAt(i);
        }

        // System.out.println(A.toString());
        
        int p = 0;
        int q = A.length()-1;
        
        while(p < q) {
            if(A.charAt(p) != A.charAt(q))
                return false;
            p++;
            q--;
        }
        
        return true;
    }
}
