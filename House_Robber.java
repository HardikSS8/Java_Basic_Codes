class Solution {
    public int rob(int[] nums) {
        
        int len = nums.length;
        
        if(len == 0)
            return 0;
        if(len == 1)
            return nums[0];
        if(len == 2)
            return Math.max(nums[0], nums[1]);
        
        int max = Integer.MIN_VALUE;
        
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        for(int i=2; i<len; i++) {
    
            // System.out.println("First : " + Arrays.toString(dp));
    
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);    
            max = Math.max(dp[i], max);
            
            // System.out.println("Last : " + Arrays.toString(dp));
            // System.out.println();
        }
        
        return max;
    }
}
