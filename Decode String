class Solution {
    public String decodeString(String s) {
        
        Stack<String> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            
            if(s.charAt(i) != ']')
                stack.push(Character.toString(s.charAt(i)));
            
            else {
                
                String repeated_string = "", numer_of_repetition = "", final_string = "";
                
                while(!stack.peek().equals("[")) {
                    repeated_string = stack.pop() + repeated_string;
                }
                
                stack.pop();
                
                while(!stack.empty() && Character.isDigit(stack.peek().charAt(0))) {
                    numer_of_repetition = stack.pop() + numer_of_repetition;
                }
                int n = Integer.parseInt(numer_of_repetition);
                while(n-- > 0)
                    final_string += repeated_string;
                
                stack.push(final_string);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.empty())
            sb.append(stack.pop());
                
        return sb.toString();
    }
}
