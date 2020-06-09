class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] target = new int[2*n];
        int p = 0, q = 1;
        
        for(int i=0; i<2*n; i++) {
            if(i < n) {
                target[p] = nums[i];            
                p = p+2;
            } else {
                target[q] = nums[i];            
                q = q+2;
            }
        }
        return target;
    }
}
