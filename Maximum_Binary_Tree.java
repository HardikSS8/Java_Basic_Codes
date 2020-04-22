/**
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 */
class Solution {
    
    public int find_index_of_max(int[] nums, int start, int end) {
        int max_index = start;
        
        for(int i=start; i<end; i++) {
            if(nums[i] > nums[max_index])
                max_index = i;
        }
        return max_index;
    }
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        return helper(nums, 0, nums.length);
    }
    
    public TreeNode helper(int nums[], int start, int end) {
        
        if(start == end)
            return null;
        int max_index = find_index_of_max(nums,start,end);
        TreeNode root = new TreeNode(nums[max_index]);
        
        root.left = helper(nums, start, max_index);
        root.right = helper(nums, max_index+1, end);
        
        return root;
    }
}
