/*
   public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
 */
class Solution {
    
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> ans = new ArrayList<Double>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int avg = 0;
        while(!q.isEmpty()) {
            long sum = 0, count = 0;
            Queue<TreeNode> t = new LinkedList<TreeNode>();
            
            while (!q.isEmpty()) {  
                TreeNode n = q.peek();  
                q.remove();  
                sum += n.val;  
                count++;  
                if (n.left != null)  
                    t.add(n.left);  
                if (n.right != null)  
                    t.add(n.right);  
            }  
            q = t;
            ans.add(sum * 1.0 /count);
        }
        return ans;
    }
}
