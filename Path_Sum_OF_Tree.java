/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if(root == null & sum == 0)
            return false;
        if(root == null)
            return sum==0;
        else {
            
            boolean ans = false;
            
            if(sum-root.val == 0 && root.left == null && root.right == null)
                return true;
            
            if(root.left != null)
                ans = ans || hasPathSum(root.left, sum-root.val);
            if(root.right != null)
                ans = ans || hasPathSum(root.right, sum-root.val);
            return ans;        
        }
    }
}
