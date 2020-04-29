/*
   public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
  
        ListNode curr = head;
        while(curr != null) {
            ListNode t = curr;
            while(t != null && t.val == curr.val) { 
                t = t.next; 
            } 
            curr.next = t; 
            curr = curr.next; 
        }
        return head;
    }
}
