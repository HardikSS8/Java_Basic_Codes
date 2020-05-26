class Solution {
    public String removeOuterParentheses(String S) {

        StringBuilder s = new StringBuilder();
        int no_of_open = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && no_of_open++ > 0) 
                s.append(c);
            if (c == ')' && no_of_open-- > 1) 
                s.append(c);
        }
        return s.toString();
    }
}  
