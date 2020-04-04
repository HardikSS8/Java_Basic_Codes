class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        Arrays.sort(nums);
            
        for(int i=1; i<=nums.length; i++) {
            int res = Arrays.binarySearch(nums, i);
            if(res < 0)
                ans.add(i);
        }
        return ans;
    }
}
