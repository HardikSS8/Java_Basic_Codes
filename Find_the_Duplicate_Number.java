class Solution {
    public int findDuplicate(int[] nums) {
        
        int[] arr = new int[nums.length + 1];
        
        for(int num:nums) {
            arr[num]++;
            if(arr[num] > 1)
                return num;
        }
        return 0;
    }
}
