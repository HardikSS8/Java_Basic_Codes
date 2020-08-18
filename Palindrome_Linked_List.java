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
    
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null)
            return true;
        
        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode rev = reverseList(slow);
        fast = head;
        while (rev != null) {
            if (rev.val != fast.val)
                return false;
            rev = rev.next;
            fast = fast.next;
        }

        return true;
    }
}
