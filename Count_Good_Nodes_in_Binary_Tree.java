/*
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
        
    public int dfs(TreeNode root, int max, int count) {
           
        if(root.val >= max) {
            count++;
            max = root.val;
        }
                
        if(root.left != null) 
            count = dfs(root.left, max, count);
        
        if(root.right != null)
            count = dfs(root.right, max, count);
        
        return count;
    }
    
    public int goodNodes(TreeNode root) {
        
        return dfs(root, root.val, 0);
    }
}
