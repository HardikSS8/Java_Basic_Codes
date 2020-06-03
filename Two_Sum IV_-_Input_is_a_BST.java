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
    List<Integer> list = new ArrayList<Integer>();
    
    public void helper(TreeNode root) {
        if(root != null) {
            helper(root.left);
            list.add(root.val);
            helper(root.right);
        }
    }
    
    public boolean findTarget(TreeNode root, int k) {
        helper(root);
        
        int i = 0;
        int j = list.size()-1;
        
        while(i < j) {
            int sum = list.get(i) + list.get(j);
            if(sum < k)
                i++;
            else if(sum > k)
                j--;
            else {
                return true;
            }
        }
        return false;
    }
}
