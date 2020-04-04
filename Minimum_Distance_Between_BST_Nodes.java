/*
   public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
 */
class Solution {
    int min_val = Integer.MAX_VALUE;
    int prev = -1;
    public void helper(TreeNode root) { 
        if(root == null)
            return;
        helper(root.left);
        if(prev != -1)
            min_val = Math.min(min_val, (root.val - prev));
        prev = root.val;
        helper(root.right);
    }

    public int minDiffInBST(TreeNode root) {
        helper(root);
        return min_val;
    }
}
