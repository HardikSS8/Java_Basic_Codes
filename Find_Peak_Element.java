class Solution {
    public int findPeakElement(int[] nums) {
        
        int n = nums.length;
        if(nums == null && n == 0)
            return 0;
        if(n == 2) {
            if(nums[0] > nums[1])
                return 0;
            else
                return 1;
        }
        int i = 1;
        while(i < n-1) {
            if(nums[i] > nums[i-1] && nums[i+1] < nums[i])
                return i;
            i++;
        }
        return (nums[n-1] > nums[0] ? n-1 : 0);
    }
}
