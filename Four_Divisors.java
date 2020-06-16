class Solution {
    
    public int findDivisors(int n) {
        
        int count = 0;
        int sum = n+1;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                if(n/i == i)
                    return 0;
                else {
                    sum += i + n/i;
                    count = count + 2;
                }
            }
        }
        if(count == 2) return sum;
        else return 0;
    }
    
    public int sumFourDivisors(int[] nums) {
        
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            sum += findDivisors(nums[i]);
        }

        return sum;
    }
}
