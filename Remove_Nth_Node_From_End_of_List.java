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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode curr = new ListNode(0);
        curr.next = head;
        ListNode root = head;
        int len = 0;
        while(root != null) {
            len++;
            root = root.next;
        }
        len -= n;
        
        // System.out.println(len);
        // System.out.println(n);
        // System.out.println(l);
        
        root = curr;
        int count = 0;
        while(len > 0) {
            len--;
            root = root.next;
        }
        root.next = root.next.next;
        return curr.next;
    }
}
