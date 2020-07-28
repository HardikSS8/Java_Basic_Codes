class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s == null || t == null)
            return false;
        
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray())
            stack.push(c);
        
        
        for(int i=t.length()-1; i>=0; i--) {
            
            if(!stack.empty() && stack.peek() == t.charAt(i))
                stack.pop();
        }
        
        return stack.empty();
    }
}
