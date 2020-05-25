class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<String>();
        
        for(int i=1, j=0; i<=n && j<target.length; i++) { 
            ans.add("Push");
            
            if(i == target[j])
                j++;
            else
                ans.add("Pop");
        }
        return ans;
    }
}
