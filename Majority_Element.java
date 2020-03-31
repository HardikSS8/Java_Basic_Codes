class Solution {
    public int majorityElement(int[] nums) {
        
        int len = nums.length;
        int ans = 0;
        int[] count = new int[len];
        boolean[] visited = new boolean[len];
        Arrays.fill(visited, false);
            
        for(int i=0; i<len; i++) {
            if(visited[i] == true)
                continue;
            
            int val = 1;
            for(int j=i+1; j<len; j++) {
                if(nums[j] == nums[i]) {
                    visited[j] = true;
                    val++;
                }
            }
            count[i] = val;
            if(val > len/2)
                ans = nums[i];
        }
        return ans;
    }
}
