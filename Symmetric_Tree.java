/*
   public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
 */
class Solution {
    
    public boolean mirror(TreeNode leftTree, TreeNode rightTree) {
        if(leftTree == null && rightTree == null)
                return true;
        
        if(leftTree != null && rightTree != null && (leftTree.val == rightTree.val))
            return mirror(leftTree.left, rightTree.right) && mirror(leftTree.right, rightTree.left);
    
        return false;
    }
  
    public boolean isSymmetric(TreeNode root) {
        
        return mirror(root, root);
    }
}
