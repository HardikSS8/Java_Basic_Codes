/*
  Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 */
 
class Solution {
  public boolean helper(TreeNode node, Integer min, Integer max) {
    if (node == null) 
        return true;
    if (min != null && node.val <= min) 
        return false;
    if (max != null && node.val >= max) 
        return false;

    if (! helper(node.right, node.val, max)) 
        return false;
    if (! helper(node.left, min, node.val)) 
        return false;
    return true;
  }

  public boolean isValidBST(TreeNode root) {
    return helper(root, null, null);
  }
}
