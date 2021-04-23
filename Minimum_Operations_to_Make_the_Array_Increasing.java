class Solution {
    public int minOperations(int[] nums) {
        
        int count_oper = 0;
        
        for(int i = 1; i < nums.length; i++) {
            
            if(nums[i] > nums[i-1]) 
                continue;
            count_oper += nums[i-1] - nums[i] + 1;
            nums[i] += nums[i-1] - nums[i] + 1;
        }
        
        System.out.println(Arrays.toString(nums));
        
        return count_oper;
    }
}
