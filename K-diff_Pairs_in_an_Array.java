
//  280 ms 
// class Solution {
//     public int findPairs(int[] nums, int k) {
        
//         Arrays.sort(nums);
        
//         int count = 0;
//         int a = -100000000, b = -100000000;
//         for(int i=0; i<nums.length; i++) {
            
//             for(int j=i+1; j< nums.length; j++) {
//                 if(nums[j] - nums[i] == k && nums[j] != a && nums[i] != b) {
//                     a = nums[j];
//                     b = nums[i];
//                     count++;
//                 }
//             }
//         }
        
//         return count;
//     }
// }

// 3 ms

class Solution {
    public int findPairs(int[] nums, int k) {
        
        if(k < 0) 
            return 0;
        
        Arrays.sort(nums);
        
        int left = 0, right = 1, count = 0;
        
        while(right < nums.length){
            if(nums[right] - nums[left] > k)
                left++;
            
            else if(nums[right] - nums[left] < k || right == left)
                right++;
            
            else{
                count++;
                left++;
                right++;
                while(right < nums.length && nums[right] == nums[right - 1]) 
                    right++;
            }
        }
        return count;
        
    }
}
