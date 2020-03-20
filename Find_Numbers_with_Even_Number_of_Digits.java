class Solution {
    public int findNumbers(int[] nums) {
        
        int len = nums.length, count = 0;
        
        for(int i=0; i<len; i++) {
            int digit = 0;
            int a = nums[i];
            while(a > 0) {
                digit++;
                a = a/10;
            }
            if(digit%2 == 0){
                count++;
            }
        }
        return count;
    }
}
