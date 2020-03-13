class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int n = nums.length;
        int ans = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] == target) {
                ans = i;
                break;
            } else if (target < nums[0]) {
                ans = 0;
                break;
            }
            else if (target > nums[n-1]) {
                ans = n;
                break;
            } 
            else if (nums[i] < target) {
             
            } 
            else {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
