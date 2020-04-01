/*
   public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
 */
class Solution {
    List<Integer> ans = new ArrayList<Integer>();
    
    public void helper(TreeNode root) { 
        if(root != null) {
            ans.add(root.val);
            helper(root.left);
            helper(root.right);
        }
    }
    public boolean isUnivalTree(TreeNode root) {     
        helper(root);
        int v = ans.get(0);
        for(int i=0; i<ans.size(); i++) {
            if(ans.get(i) != v)
                return false;
        }
        return true;
    }
}
