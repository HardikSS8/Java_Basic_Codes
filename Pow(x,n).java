class Solution {
    public double myPow(double x, int n) {
        double sum = 1;
        if( n == 0  && x != 0) {
            return 1;
        } else if ( n != 0 && x == 0) {
            return 0;
        } else if ( x == 1 && n != 0) {
            return 1; 
        } else if ( x == -1 && n > 0) {
            return -1;
        } else if ( x == -1 && n < 0 ) {
            return 1;
        } else if ( n > Integer.MIN_VALUE && n < Integer.MAX_VALUE) {
            int n1 = n > 0 ? n : (-1)*n;
            while(n1 > 0) {
                sum = sum*x;
                n1--;
            }
            if(n > 0)
                return sum;
            else
                return 1/sum;
        } else {
            return 0;
        }
    }
}
