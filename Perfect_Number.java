class Solution {
    public boolean checkPerfectNumber(int n) {
        if(n <= 1)
            return false;
        
        int sum = 1;
        int temp = n;
        for(int i=2; i<temp; i++) {
            if((n % i) == 0) {
                temp = n/i;
                sum += i;
                sum += temp;
            }
            if(sum > n)
                break;
        }
        return sum == n;       
    }
}
