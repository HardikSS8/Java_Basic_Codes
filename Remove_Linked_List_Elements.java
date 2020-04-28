/*
   public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = new ListNode(-1);
        curr.next = head;
        ListNode node = curr;
        
        while(node.next != null) {
            if(node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return curr.next;
    }
}
