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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>(); 
        level(root, ans, 0);
        
        for(int i=0; i<ans.size(); i++) {
            if(i % 2 != 0)
                Collections.reverse(ans.get(i));
        }
        return ans; 
    }

    public void level(TreeNode root, List<List<Integer>> ans, int h) {
        
        if (root == null) return;
        
        if (h >= ans.size())
            ans.add(new ArrayList<>());
                    
        ans.get(h).add(root.val);
        level(root.left, ans, h+1);
        level(root.right, ans, h+1);
    }
}
