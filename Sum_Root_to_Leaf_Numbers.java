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
    
    public int check(TreeNode root, int sum) {
        
        if(root == null)
            return 0;
        
        sum = sum*10 + root.val;
        if(root.left == null && root.right == null)
            return sum;

        return check(root.left,sum) + check(root.right,sum);
    }
    
    public int sumNumbers(TreeNode root) {
        
        return check(root, 0);
    
    }
}
