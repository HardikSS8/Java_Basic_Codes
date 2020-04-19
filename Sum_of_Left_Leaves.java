/* 
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
 */
class Solution {
    public boolean leaf(TreeNode root) {        
        if(root == null)
            return false;
        if(root.left == null && root.right == null)
            return true;
        return false;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root != null) {
            if(leaf(root.left)) {
                sum += root.left.val;
            } else {
                sum += sumOfLeftLeaves(root.left);      
            }
            sum += sumOfLeftLeaves(root.right);
        }
        return sum;
    }
}
