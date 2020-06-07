class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        
        while (n >= 5) {
            int cur = n / 5;
            count += cur;
            n = cur;
        }
        return count;
    }
}
