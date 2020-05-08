class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ans = new int[nums1.length];
        int k = 0;
        
        for(int i=0; i<nums1.length; i++) {
            
            int a = nums1[i], index = -1;
            
            for(int j=0; j<nums2.length; j++) {
                if(nums2[j] == a)
                    index = j;
            }
            for(int j=index+1; j<nums2.length; j++) {
                if(nums2[j] > a) {
                    a = nums2[j];
                    break;
                }
            }
            if(a == nums1[i]) ans[k++] = -1;
            else ans[k++] = a;
        }
        return ans;
    }
}
