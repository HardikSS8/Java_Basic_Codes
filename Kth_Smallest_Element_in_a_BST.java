/**
   public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
 */
 
class Solution {
    List<Integer> BST = new ArrayList<>();
    
    public List<Integer> inOrder(TreeNode root) {
        if(root != null) {
            inOrder(root.left);
            BST.add(root.val);
            inOrder(root.right);
        }
        return BST;
    }
    
    public int kthSmallest(TreeNode root, int k) {
        
        inOrder(root);
        return BST.get(k-1);
    }
}
