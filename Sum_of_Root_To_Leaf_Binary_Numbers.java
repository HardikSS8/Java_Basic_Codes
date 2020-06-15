class Solution {
    int sum = 0;
    
    public int sumRootToLeaf(TreeNode root) {
        if(root == null) 
            return 0;
        
        helper(root,0);
        return sum;
    }
    
    private void helper(TreeNode root, int currSum){
        if(root == null) 
            return;
        
        currSum = (currSum * 2) + root.val;
        
        if(root.left == null && root.right == null) {
            sum += currSum;
        }
        helper(root.left, currSum);
        helper(root.right, currSum);
    }
}
