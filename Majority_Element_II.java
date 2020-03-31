class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int len = nums.length, ans = 0;
        
        List<Integer> count = new ArrayList<Integer>();
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
            if(val > len/3)
                count.add(nums[i]);
        }
        return count;
    }
}
