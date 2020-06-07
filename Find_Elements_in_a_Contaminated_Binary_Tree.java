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
 
class FindElements {
    
    Set<Integer> set;
    
    public FindElements(TreeNode root) {
        set = new HashSet<>();
        root.val = 0;
        helper(root,set,0);
    }

    public void helper(TreeNode node, Set<Integer> set,int x) {
        if(node == null) {
            return;
        }

        if(node.left != null) {
            node.left.val = 2*x + 1;
        }

         if(node.right != null) {
            node.right.val = 2*x + 2;
        }
        set.add(x);
        
        if(node.left != null) helper(node.left, set, node.left.val);
        if(node.right != null)  helper(node.right, set, node.right.val);
    }

    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
