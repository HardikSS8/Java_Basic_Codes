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
    
   public  List<List<Integer>> levelOrderBottom(TreeNode root) {
   
        List<List<Integer>> ans = new ArrayList<>();
        levelOrderBottom(root, ans, 0);
        return ans;
    }

    private static void levelOrderBottom(TreeNode node, List<List<Integer>> ans, int depth) {
        
        if (node == null) return;

        if (ans.size() <= depth)
            ans.add(0, new ArrayList<>());
            
        ans.get(ans.size() - depth - 1).add(node.val);
        levelOrderBottom(node.left, ans, depth + 1);
        levelOrderBottom(node.right, ans, depth + 1);
    }
}
