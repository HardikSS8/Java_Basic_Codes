class Solution {
    public void sortColors(int[] nums) {
        
        int count_zero = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0)
                count_zero++;
        }
        
        int count_one = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1)
                count_one++;
        }
        
        int count_two = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 2)
                count_two++;
        }
        
        for(int i=0; i<nums.length; i++) {
            if(i < count_zero)
                nums[i] = 0;
            else if(i < count_zero + count_one)
                nums[i] = 1;
            else
                nums[i] = 2;
        }
    }
}
