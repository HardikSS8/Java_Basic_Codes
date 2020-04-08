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
    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();
    
    public void helper1(TreeNode root1) {
        if(root1 != null) {
            if(root1.left == null && root1.right == null)
                list1.add(root1.val);
            else {
                helper1(root1.left);
                helper1(root1.right);
            }   
        }
    }
    
    public void helper2(TreeNode root2) {
        if(root2 != null) {
            if(root2.left == null && root2.right == null)
                list2.add(root2.val);
            else {
                helper2(root2.left);
                helper2(root2.right);
            }        
        }   
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        helper1(root1);
        helper2(root2);
        // System.out.println(list1);
        // System.out.println(list2);
        if(list1.equals(list2))
            return true;
        else
            return false;
    }
}
