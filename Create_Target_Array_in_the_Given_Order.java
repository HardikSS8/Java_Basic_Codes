class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int n = nums.length;
        int[] target = new int[n];
        
        for(int i=0; i<n; i++) {
            for(int j=i; j>index[i]; j--) {
                target[j] = target[j-1];
            }
            target[index[i]] = nums[i];
        }
        
        return target;
    }
}
