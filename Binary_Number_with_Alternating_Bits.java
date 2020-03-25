class Solution {
    public boolean hasAlternatingBits(int n) {
        
        String A = Integer.toBinaryString(n);
        
        for (int i = 0; i < A.length() - 1; i++) {
            if (A.charAt(i) == A.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
}
