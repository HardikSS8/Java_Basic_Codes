class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        int n = nums.length;
        
        if(nums == null || n == 0)
            return false;
        
        boolean flag = false;
        for(int i=0; i<n; i++) {
            int a = Arrays.binarySearch(nums, nums[i]);
            if(Math.abs(i-a) <= k && i!=a)
                flag = true;
        }
        return flag;
    }
}
