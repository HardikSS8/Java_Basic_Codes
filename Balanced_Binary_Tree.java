/**
   public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
 */
class Solution {
    public int maxDepth(TreeNode root) {   
        if(root == null)
            return 0;
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);

        if(left_depth == -1 || right_depth == -1)
            return -1;
        if(Math.abs(left_depth - right_depth) > 1)
            return -1;
        
        return Math.max(left_depth,right_depth)+1;
    }   

    public boolean isBalanced(TreeNode root) {        
        return maxDepth(root) != -1;
    }
}
