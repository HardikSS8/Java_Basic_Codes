 /*  Kadane’s Algorithm:
     Initialize:
         max_so_far = 0
         max_ending_here = 0

     Loop for each element of the array
       (a) max_ending_here = max_ending_here + a[i]
       (b) if(max_ending_here < 0)
                max_ending_here = 0
       (c) if(max_so_far < max_ending_here)
                max_so_far = max_ending_here

     return max_so_far
 */
 
 class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        int max_ending = 0;
        int max_sum_so_far = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++) {
            max_ending += nums[i];
            
            if(max_ending > max_sum_so_far) {
                max_sum_so_far = max_ending;
            }
            if(max_ending < 0)
                max_ending = 0;
        }
        return max_sum_so_far;
    }
}
