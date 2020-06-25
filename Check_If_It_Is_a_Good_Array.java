class Solution {
    
    public int gcd(int a, int b) {
        if (a < b)
            return gcd(b, a);
        return a % b == 0 ? b : gcd(b, a % b);
    }
    
    public boolean isGoodArray(int[] nums) {
        
        int value = nums[0];
        
        for(int i=0; i<nums.length; i++) {
            
            if(value == 1)
                return true;
            value = gcd(value, nums[i]);
        }
        
        return value == 1 ? true : false;
    }
}
