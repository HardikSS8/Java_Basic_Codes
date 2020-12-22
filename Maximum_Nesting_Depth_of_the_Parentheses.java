class Solution {
    public int maxDepth(String s) {
        
        int ans = 0;
        
        int open = 0;
        int close = 0;
        
        for(char c : s.toCharArray()) {
            if(c == '(')
                open++;
            else if(c == ')')
                close++;
            
            ans = Math.max(ans, Math.abs(open-close));
        }
        
        return ans;
    }
}
