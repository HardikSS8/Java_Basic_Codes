class Solution {
    public int pivotIndex(int[] nums) {
     
        int index = -1, n = nums.length, left_sum = 0, total = 0;
        
        for(int i=0; i<n; i++)
            total += nums[i];
        
        for(int i=0; i<nums.length; i++) {
            left_sum += nums[i];
            int right_sum = 0;
                        
            right_sum = total - left_sum + nums[i];
                       
            if(left_sum == right_sum) {
                return i;
            }
        }
        
        return index;
    }
}
