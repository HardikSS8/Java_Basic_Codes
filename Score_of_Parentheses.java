class Solution {
    public int scoreOfParentheses(String s) {
        
        int num = 0, open = 1;
        int n = s.length();
       
        for(int i=0; i<n; i++) {
            
            if(s.charAt(i) == '(') {
                if(s.charAt(i+1) == '(') {
                    open *= 2;
                } else {
                    num += open;
                    i++;
                }
            }   
            else {
                open = open/2;
            }
        }
        return num;
    }
}
