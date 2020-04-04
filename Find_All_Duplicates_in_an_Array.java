class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        
        int[] visited = new int[nums.length + 1];
        for (int num : nums) {
            visited[num]++;
            if (visited[num] > 1) {
                ans.add(num);
            }
        }
        return ans;
    }
}
