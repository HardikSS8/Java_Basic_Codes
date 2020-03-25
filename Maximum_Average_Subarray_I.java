public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum=0;
        double MAX_SUM = sum;
        
        for(int i=0; i<k; i++)
            sum += nums[i];
        
        for(int i=k; i<nums.length; i++){
            sum += nums[i] - nums[i-k];
                MAX_SUM = Math.max(MAX_SUM,sum);
        }
        return MAX_SUM/k;
    }
}
