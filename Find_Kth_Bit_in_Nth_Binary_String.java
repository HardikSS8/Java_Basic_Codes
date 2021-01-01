class Solution {
    
    public StringBuilder invert(String s) {
        
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c == '0')
                ans.append(1);
            else
                ans.append(0);
        }
        return ans;
    }
    
    public char findKthBit(int n, int k) {
        
        String s = "0";
        if(n == 1)
            return '0';
        
        for(int i = 2; i <= n; i++) {
            StringBuilder r = invert(s);
            s += "1" + r.reverse();
        }
        
        return s.charAt(--k);
    }
}
