class Solution {
    public List<Integer> countSmaller(int[] nums) {
        
        int n = nums.length;
        
        List<Integer> arr = new ArrayList<Integer> ();
                
        for(int i=0; i<n; i++) {
            int count = 0;
            int small = nums[i];
            for(int j=i+1; j<n; j++) {
                
                if(nums[j] < small)
                    count++;
            }
            arr.add(i, count);
        }
        return arr;   
    }
}
