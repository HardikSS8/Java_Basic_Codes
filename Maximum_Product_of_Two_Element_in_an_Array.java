  // Solution 1 (0ms)

class Solution {
    public int maxProduct(int[] nums) {
        
        int max1 = 0;
        int max2 = 0;
        int index1 = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max1) {
                max1 = nums[i];
                index1 = i;
            }
                
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max2 && i != index1) 
                max2 = nums[i];
        
        return (max1 - 1) * (max2 - 1);           
    }
}
        
      // Solution 2 ( 7ms solution)


// class Solution {
//     public int maxProduct(int[] nums) {
        
//         int max = 0;
        
//         for(int i=0; i<nums.length; i++) {
            
//             for(int j=0; j<nums.length; j++) {
                
//                 if((nums[i]-1)*(nums[j]-1) > max && i!=j) {
                    
//                     max = (nums[i]-1)*(nums[j]-1);
//                 }
//             }
//         }
//         return max;
//    }
// }
