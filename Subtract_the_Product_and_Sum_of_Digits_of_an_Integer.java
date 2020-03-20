class Solution {
    public int subtractProductAndSum(int n) {
        
        int sum = 0, temp = n, prod = 1;
        
        while(n > 0) {
            sum = sum + n%10;
            n = n/10;
        }
        
        while(temp > 0) {
            int rem = temp%10;
            prod = prod * rem;
            temp = temp/10;
        }
        return prod-sum;
    }
}
