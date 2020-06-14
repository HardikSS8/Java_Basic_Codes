/*
  public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
 */
class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();        
        level(root, ans, 0);
        return ans;        
    }
    
    public void level(TreeNode root, List<List<Integer>> ans, int h) {
        
        if (root == null)
            return;
        
        if (h >= ans.size())
            ans.add(new ArrayList<>());
                  
        ans.get(h).add(root.val);
        
        System.out.println("List size : " + ans.size());
        System.out.println("List :" + ans);
        System.out.println("Height :" + h);
        System.out.println();
        
        level(root.left, ans, h+1);
        level(root.right, ans, h+1);
    }
}
