class Solution {
    public String removeDuplicates(String S) {
        
        if (S == null || S.length() == 0) return "";
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<S.length(); i++) {
            
            if(stack.empty()) 
                stack.push(S.charAt(i));
            else if (stack.peek() == S.charAt(i))
                stack.pop();
            else {
                stack.push(S.charAt(i));
            }
        }
        
        // Solution 1 - 140ms (time complexity)
        
//        String A = ""
//        while(!stack.empty()) {
//          A = stack.pop() + A;
//        }
//        return A;
        
        // Soltuin 2 - 26ms (time complexity)
        
//         while (!stack.empty()) {
//             A.append(stack.pop());
//         }
//         A = A.reverse();
//         return A.toString();

        // Solution 3 - 11ms (time complexity)

           int index = -1;
           char[] charArray = S.toCharArray();
           for (char c: charArray) {
               if (index >= 0 && c == charArray[index])
                   index--;
               else
                   charArray[++index] = c;
           }
           return new String(charArray, 0, index + 1);
    }
}
