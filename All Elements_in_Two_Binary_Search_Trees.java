/*
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
    
    public List<Integer> make_list1(TreeNode root) {
    
        if (root != null) {
            list1.add(root.val);
            make_list1(root.left);
            make_list1(root.right);
        }
        return list1;
    }
    
    public List<Integer> make_list2(TreeNode root) {
    
        if (root != null) {
            list2.add(root.val);
            make_list2(root.left);
            make_list2(root.right);
        }
        return list2;
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        List<Integer> list3 = new ArrayList<Integer>();
        
        list1 = make_list1(root1);
        list2 = make_list2(root2);
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        System.out.println(list1);
        System.out.println(list2);
        
        int total = list1.size() + list2.size();
        for(int i=0; i<list1.size(); i++) {
            list3.add(list1.get(i));
        }
        for(int i=0; i<list2.size(); i++) {
            list3.add(list2.get(i));
        }
        Collections.sort(list3);
        return list3;
    }
}
