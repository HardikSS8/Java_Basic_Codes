/*
   public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
 */
 
 // SOLUTION 1
 
class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        List<Integer> list1 = new ArrayList<Integer>();
        ListNode root1 = head;
        while(head != null) {
            list1.add(head.val);
            head = head.next;
            if(head != null)
                head = head.next;
        }
        if(root1 != null)
            root1 = root1.next;
        while(root1 != null) {
            list1.add(root1.val);
            root1 = root1.next;
            if(root1 != null)
                root1 = root1.next;
        }
        
        System.out.println(list1);
        
        for(int i=0; i<list1.size(); i++) {
            ListNode temp = new ListNode(); 
            ListNode ans; 
            temp.val = list1.get(i); 
            temp.next = null; 
            if (head == null) 
                head = temp; 
            else { 
                ans = head; 
                while (ans.next != null) 
                    ans = ans.next; 
                ans.next = temp; 
            }
        }
        return head; 
    }
}

// SOLUTION 2 

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
