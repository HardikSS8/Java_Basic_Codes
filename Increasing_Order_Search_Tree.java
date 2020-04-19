class Solution {  
    List<Integer> list = new ArrayList<Integer>();
    
    public void helper(TreeNode root) {
        if (root != null) {
            helper(root.left);
            list.add(root.val);
            helper(root.right);
        }
    }
    public TreeNode increasingBST(TreeNode root) {
        helper(root);
        TreeNode ans = new TreeNode(0), cur = ans;
        for (int i: list) {
            cur.right = new TreeNode(i);
            cur = cur.right;
        }
        return ans.right;
    }
}
