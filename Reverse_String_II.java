class Solution {
    public String reverseStr(String s, int k) {
        
        char[] a = s.toCharArray();
        int i = 0;
    
        while(i < s.length()) {
            int p = i, q = Math.min(i + k - 1, s.length() - 1);
            while(p < q) {
                
                char temp = a[p];
                a[p++] = a[q];
                a[q--] = temp;
            }
            
            i = i + 2*k;
        }
        
        return new String(a);
    }
}
