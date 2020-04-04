/**
   public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
 */
class Solution {
    List<Integer> in = new ArrayList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null) {
            inorderTraversal(root.left);
            in.add(root.val);
            inorderTraversal(root.right);
        }
        return in;
    }
}
