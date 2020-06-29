class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<tokens.length; i++) {
            
            if(!"+-*/".contains(tokens[i]))
                stack.push(Integer.valueOf(tokens[i]));
            
            else {
                
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;
                
                if(tokens[i].equals("+"))
                    result = a + b;
                else if(tokens[i].equals("-"))
                    result = a - b;
                else if(tokens[i].equals("*"))
                    result = a * b;
                else
                    result = a / b;
                
                stack.push(result);
            }
        }
        
        return stack.pop();
    }
}
