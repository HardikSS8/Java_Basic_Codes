/**
   public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        
        String A = "";    
        if(head == null)
            return 0;
        while(head != null) {
            A += head.val;
            head = head.next;
        }       
        int num = Integer.parseInt(A,2);
        return num;
    }
}
