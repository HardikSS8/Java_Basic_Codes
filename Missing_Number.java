class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums); 
        
        if(nums[n-1] != n)
            return n;
        else if(nums[0] != 0)
            return 0;
        
        for(int i=1; i<n; i++) {
            if(nums[i] != (nums[i-1] + 1))  {
                return (nums[i-1]+1);
            } 
        }
        return -1;
    }
}
