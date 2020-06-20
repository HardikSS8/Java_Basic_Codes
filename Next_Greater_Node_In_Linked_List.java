// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */

//        800 ms

// class Solution {
//     public int[] nextLargerNodes(ListNode head) {
            
//         ListNode cur = head;
        
//         List<Integer> list = new ArrayList<>();
        
//         while(cur != null) {
//             list.add(cur.val);
//             cur = cur.next;
//         }
        
//         System.out.println(list);
        
//         int[] ans = new int[list.size()];
        
//         int i = 0;
//         while(i < list.size()) {
//             int check = list.get(i);
//             for(int j=i+1; j<list.size(); j++) {
//                 if(list.get(j) > check) {
//                     ans[i] = list.get(j);
//                     break;
//                 }
//             }
//             i++;
//         }
//         return ans;
//     }
// }

//        14 ms

class Solution {
    public int[] nextLargerNodes(ListNode head) {
    
        ArrayList<Integer> list = new ArrayList();
        ListNode temp = head;
        
        while(temp!= null){
          list.add(temp.val);
          temp=temp.next;
        }
        int[] ans= new int[list.size()];
        Stack<Integer> stack = new Stack();
        for(int i=0;i<list.size();i++){
             while(!stack.isEmpty() && list.get(i) > list.get(stack.peek())){
                ans[stack.pop()] = list.get(i);
            }
            stack.push(i); 
        }
        return ans;
    }
}
