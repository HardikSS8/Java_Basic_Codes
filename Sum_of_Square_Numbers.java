class Solution {
    public boolean judgeSquareSum(int c) {
            
        for(int i = 0; i <= Math.sqrt(c); i++) {
            double a = Math.sqrt(c - Math.pow(i,2));
            if(a == Math.floor(a))
                return true;
        }
        return false;
    }
}
