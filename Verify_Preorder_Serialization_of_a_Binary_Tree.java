//      5 ms 

class Solution {
    public boolean isValidSerialization(String preorder) {
        
        
        if (preorder == null) {
            return false;
        }
        Stack<String> st = new Stack<>();
        String[] strs = preorder.split(",");
        
        for (int pos = 0; pos < strs.length; pos++) {
        
            String curr = strs[pos];
            
            while (curr.equals("#") && !st.isEmpty() && st.peek().equals(curr)) {
                st.pop();
                if (st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
            st.push(curr);
        }
        return st.size() == 1 && st.peek().equals("#");
    }
    

}

//      1 ms

// class Solution {

//     public boolean isValidSerialization(String preorder) {
    
//         int cnt = 1, size = preorder.length();
//         for(int i=0; i<size; i++){
//             char c = preorder.charAt(i);
//             if(c == ',') {
//                 continue;
//             } else if(c == '#'){
//                 cnt--;
//             if(cnt < 0 || (cnt == 0 && i < size-1)) 
//                 return false;
//             } else {
//                 cnt++;
//                 while(i+1<size && Character.isDigit(preorder.charAt(i+1))) 
//                     i++;
//             }
//         }
//     return cnt == 0 ? true : false;
//     }
// }
