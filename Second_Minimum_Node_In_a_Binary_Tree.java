class Solution {
    
    Set<Integer> set = new HashSet<Integer>();
    
    public Set<Integer> helper(TreeNode root) {
        if(root != null) {
            set.add(root.val);
            helper(root.left);
            helper(root.right);
        }
        return set;
    }
    
    public int findSecondMinimumValue(TreeNode root) {
        
        helper(root);
        
        int min1 = root.val;
        long ans = Long.MAX_VALUE;
        for (int v : set) {
            if (min1 < v && v < ans) ans = v;
        }
        return ans < Long.MAX_VALUE ? (int) ans : -1;
    }
}
