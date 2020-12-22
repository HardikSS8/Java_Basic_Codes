class Solution {
    public int specialArray(int[] nums) {
        
        int[] count = new int[1001];
        
        for(int i : nums) {
            count[i]++;
        }
        
        int size = nums.length;
        
        
        for(int i = 0; i < 1001; i++) {
            
            if(i == size)
                return i;
            size -= count[i];
        }
        
        return -1;
    }
}
