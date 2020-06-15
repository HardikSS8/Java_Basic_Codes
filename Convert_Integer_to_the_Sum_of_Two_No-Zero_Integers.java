class Solution {
    
    public boolean containZero(int n) {
        while(n > 0) {
            int rem = n % 10;
            if(rem == 0)
                return true;
            n = n/10;
        }
        return false;
    }
    
    public int[] getNoZeroIntegers(int n) {
                
        for(int i=1; i<n; i++) {
            if(!containZero(i) && !containZero(n-i)) {
                return new int[]{ n - i, i};
            }
        }
        return null;
    }
}
