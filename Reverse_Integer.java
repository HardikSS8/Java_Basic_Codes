class Solution {
    public int reverse(int x) {
        
        long sign = 1, sum = 0;
        if(x < 0) {
            sign = -1;
            x *= -1;
        }
        
        while(x > 0) {
            int rem = x%10;
            sum = sum*10 + rem;
            x = x/10;
            if(sum > Integer.MAX_VALUE) return 0;
        }
        return (int)(sum*sign);
    }
}
