class Solution {
    public int totalHammingDistance(int[] nums) {
        
        // If there are n integers in the array and k of them have a particular bit set 
        and n-k do not, then that bit contributes k * (n - k) hamming distance to the total.
        
        if(nums==null || nums.length==0) return 0;
        
        int total=0;
        int len=nums.length;
        
        for(int j=0;j<32;j++){
            int count=0;
            for(int num:nums) count+=(num>>j)&1;
            total+=count*(len-count);
        }
        return total;
    }
}
