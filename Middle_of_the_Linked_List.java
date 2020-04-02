/**
   public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        if(head == null)
            return null;
        ListNode temp = head;
        int n = 0;
        while(head != null) {
            n++;
            head = head.next;
        }
        int i = 0;
        while(i < n/2 && temp != null) {
            temp = temp.next;
            i++;
        }
        return temp;
    }
}
