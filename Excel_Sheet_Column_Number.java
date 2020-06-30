class Solution {
    public int titleToNumber(String s) {
        
        int ans = 0;
        
        for(char c: s.toCharArray()) {
            
            ans *= 26;
            
            ans += (c - 'A' + 1);
        }
        return ans;
    }
}
