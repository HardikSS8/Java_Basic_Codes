/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        
        LinkedList<Node> ll = new LinkedList<>();
        
        LinkedList<Integer> list = new LinkedList<>();
        
        if(root == null)
            return list;
        
        ll.add(root);
        
        while(!ll.isEmpty()) {
            Node node = ll.pollLast();
            
            list.add(node.val);
            Collections.reverse(node.children);
            
            for(Node child : node.children)
                ll.add(child);
        }
        
        return list;
    }
}
