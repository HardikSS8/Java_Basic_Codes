class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        if(nums == null || nums.length == 0)
            return 0;
        
        int ans = 0, even = 0, n = nums.length, j = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] % 2 != 0) {
                --k;
                even = 0;
            }
            while(k == 0) {
                if(nums[j] % 2 != 0) {
                    k++;
                }
                j++;
                even++;
            }
            ans += even;   
        }
        return ans;
    }
}

// Solution-2 Brute Force approach (Time limit exceeded)

//class Solution {
//    public int numberOfSubarrays(int[] nums, int k) {
//        
//        if(nums == null || nums.length == 0)
//            return 0;
//        
//        int ans = 0;
//        int n = nums.length;
//        
//        for(int i=0; i<n; i++) {
//            
//           for(int j=i; j<n; j++) {
//                
//                int count = 0;
//                for(int p=i; p<=j; p++) {
//                    if(nums[p] % 2 != 0)
//                        count++;
//                }
//                if(count == k)
//                    ans++;
//            }
//        }
//        return ans;
//    }
//}
