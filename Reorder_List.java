/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public ListNode reverseList(ListNode root) {
        
        if(root == null || root.next == null)
            return root;
        ListNode next1 = reverseList(root.next);
        
        root.next.next = root;
        root.next = null;
        
        return next1;
    }
    
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null)
            return;
        
        // To break the list into two equal parts - first half anf second half
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode f_half_next, s_half_next;
        
        ListNode curr = head;
        
        ListNode rev = reverseList(slow.next);
        
        slow.next = null;
        
        while(curr != null && rev != null) {
            f_half_next = curr.next;
            s_half_next = rev.next;
            curr.next = rev;
            rev.next = f_half_next;
            rev = s_half_next;
            curr = curr.next.next;
        }
    }

}
