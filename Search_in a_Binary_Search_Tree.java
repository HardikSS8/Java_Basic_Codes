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
    public TreeNode searchBST(TreeNode root, int val) {
        
        boolean flag = true;
        if(root == null)
            return null;
        else {
            if(root.val == val) {
                return root;
            } else { flag = false;} 
            if(root.val > val)
                return searchBST(root.left, val);
            if(root.val < val)
                return searchBST(root.right, val);
        }
        if(flag == false)
            return null;
        else
            return root;
    }
}
