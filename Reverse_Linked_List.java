/*
   public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
 */
 
 // SOLUTION 1 RECURSIVE
 
class Solution {
    public ListNode reverseList(ListNode head) {
    
        if(head == null || head.next == null) {
            return head;
        }
        ListNode next1 = reverseList(head.next); 
        head.next.next = head; 
        head.next = null; 

        return next1;
    }
}   
    // SOLUTION 2 ITERATIVE
 
  
class Solution {
    public ListNode reverseList(ListNode head) {
   
         ListNode currNode = head;
         ListNode prevNode = null;
         ListNode nextNode = null;
        
         while(currNode != null) {
             nextNode = currNode.next;
             currNode.next = prevNode;
             prevNode = currNode;
             currNode = nextNode;
         }
         head = prevNode;
    }
}
        
    
