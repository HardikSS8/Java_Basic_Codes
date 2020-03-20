class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int len = nums.length, start = -1, end = -1;
        int[] ans = new int[2];
        for(int i=0; i<len; i++) {
            if(nums[i] == target) {
                start = i;
                break;
            }
        }
        for(int i=len-1; i>=0; i--) {
            if(nums[i] == target) {
                end = i;
                break;
            }
        }
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
}
