class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int n = nums.length, windowCount = 0, ans = 0;
        
        for(int i=0; i<n; i++) {
            if(nums[i] == 0) {
                windowCount = 0;
            } else {
                windowCount++;
                if(windowCount > ans)
                    ans = windowCount;
                else
                    ans = ans;
            }
        }
        return ans;
    }
}
