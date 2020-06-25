class Solution {
    public int primePalindrome(int N) {
        if (8 <= N && N <= 11) return 11;
        
        while (true) {
            if (N == reverse(N) && isPrime(N))
                return N;
            N++;
            if(N>=10 && N<100){
                N = 100;
            }else if(N>=1000 && N<10000){
                N = 10000;
            }else if(N>=100000 && N<1000000){
                N = 1000000;
            }else if(N>=10000000 && N<100000000){
                N = 100000000;
            }
        }
    }

    public boolean isPrime(int N) {
        if (N < 2) return false;
        int R = (int) Math.sqrt(N);
        for (int d = 2; d <= R; ++d)
            if (N % d == 0) return false;
        return true;
    }

    public int reverse(int N) {
        int ans = 0;
        while (N > 0) {
            ans = 10 * ans + (N % 10);
            N /= 10;
        }
        return ans;
    }
}
