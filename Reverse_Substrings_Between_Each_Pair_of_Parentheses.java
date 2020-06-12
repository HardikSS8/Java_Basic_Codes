class Solution {
    public String reverseParentheses(String s) {
        
        String A = "";
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            
            System.out.println(stack);
            
            if (stack.empty() && s.charAt(i) != '(') {
                A += s.charAt(i);
            } else if (s.charAt(i) != ')') {
                stack.push(s.charAt(i));
            } else {
                
                String temp = "";
                while (!stack.empty()) {
                    
                    if (stack.peek() != '('){
                        temp += stack.peek();
                        stack.pop();
                    } else {
                        stack.pop();
                        break;
                    }
                }                
                
                if (!stack.empty()) { 
                    
                    for (int j = 0; j < temp.length(); j++) {
                        stack.push(temp.charAt(j));
                    }
                } else {
                    A += temp;
                }
            }
        }
        
        return A;
    }
}
