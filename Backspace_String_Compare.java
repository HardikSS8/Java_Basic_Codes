class Solution {
    
    public Stack<Character> helper(String a) {
              
        Stack<Character> s = new Stack<Character>();
        
        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) != '#') {
                s.push(a.charAt(i));
            } else {
                if(!s.empty()) 
                    s.pop();
            }
        }
        return s;
    }
    
    public boolean backspaceCompare(String S, String T) {
        
        Stack<Character> stack1 = helper(S);
        Stack<Character> stack2 = helper(T);
        
        // System.out.println(stack1);
        // System.out.println(stack2);
        
        if(stack1.size() != stack2.size())
            return false;
        
        for(int i=0; i<stack1.size(); i++) {
            if(stack1.get(i) != stack2.get(i))
                return false;
        }
        return true;
    }
}
