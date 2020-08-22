class Solution {
    public int singleNonDuplicate(int[] nums) {
        
//         int[] count = new int[100001];
        
//         for(int n : nums)
//             count[n]++;
        
//         for(int i=0; i<count.length; i++) {
//             if(count[i] == 1)
//                 return i;
//         }
        
//         return -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right) {
            int mid = (left + right) / 2;
            if(mid % 2 == 1) mid--;
            if(nums[mid] != nums[mid + 1]) right = mid;
            else left = mid + 2;
        }
        
        return nums[left];
    }
}
