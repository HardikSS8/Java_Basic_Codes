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
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null)
            return root;
        else {
            TreeNode leftOne = invertTree(root.left);
            TreeNode rightOne = invertTree(root.right);
          
            root.left = rightOne;
            root.right = leftOne;
        }
        return root;
    }
}
