/*
   public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
 */
class Solution {
    List<Integer> pre = new ArrayList<Integer>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null) {
            pre.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return pre;
    }
}
