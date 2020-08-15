class Solution {
    public int maxProduct(int[] nums) {
    
        int[] dpMax = new int[nums.length];
        int[] dpMin = new int[nums.length];
        int max = nums[0];
        
        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        
//         dpMax[] = {2, 6, -2, 4}
//         dpMin[] = {2, 2, -12, -48}
        
//         max = 6
        
        for (int i = 1; i < nums.length; i++) {      
            dpMax[i] = Math.max(nums[i], 
                       Math.max(dpMax[i - 1] * nums[i], dpMin[i - 1] * nums[i]));
            dpMin[i] = Math.min(nums[i], 
                       Math.min(dpMin[i - 1] * nums[i], dpMax[i - 1] * nums[i]));
            max = Math.max(max, Math.max(dpMax[i], dpMin[i]));
        }        
        
        return max;
    }
}
