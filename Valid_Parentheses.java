class Solution {    
    public boolean isValid(String s) {
        
        int n = s.length();
        Stack<Character> ans = new Stack<Character>();
        
        if(n == 0)
            return true;
        if(n == 1)
            return false;
        
        for(int i=0; i<n; i++) {
            
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                ans.push(s.charAt(i));
            if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if(ans.isEmpty())
                    return false;
                if((s.charAt(i) == ')' && ans.peek() == '(') || (s.charAt(i) == '}' && ans.peek() == '{') || (s.charAt(i) == ']' && ans.peek() == '['))
                    ans.pop();
                else
                    return false;
            }
        }
        return ans.isEmpty() ? true : false;
    }
}
