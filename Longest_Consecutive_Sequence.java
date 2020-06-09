class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0 || nums == null)
            return 0;
        
        int count = 1;
        int max = 1;
        Arrays.sort(nums);
                
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                if(nums[i] == nums[i-1]+1) {
                    count++;
                } else {
                    System.out.println(count);
                    if(count > max)
                        max = count;
                    count = 1;
                }   
            }
        }
        
        return Math.max(count, max);
    }
}
