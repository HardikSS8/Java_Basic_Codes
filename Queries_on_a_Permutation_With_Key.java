class Solution {    
    public int[] processQueries(int[] queries, int m) {
        
        int[] ans = new int[queries.length];
        
        int[] nums = new int[m];
        for(int i=0; i<m; i++) {
            nums[i] = i+1;
        }
                
        for(int i=0; i<queries.length; i++) {
            int index = 0;
            int query = queries[i];
            
            for(int j=0; j<nums.length; j++) {
                
                if(nums[j] == query) {
                    index = j;
                    ans[i] = index;
                    break;
                }
            }
            
            int temp = nums[index];
            for(int k=index; k>0; k--) {
                nums[k] = nums[k-1];
            }
            
            nums[0] = temp;
        }
        
        return ans;
    }
}
