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
    public ListNode swapPairs(ListNode head) {
        // if (head==null && head.next==null)
        // return head;

        
        ListNode dummy=new ListNode(0);
        dummy.next = head;
        ListNode prev=dummy;
        ListNode current=head;
    
        while(current!=null && current.next!=null)
        {
            ListNode nextnode=current.next;
            current.next=nextnode.next;
            nextnode.next=current;
            prev.next = nextnode;
          
            
            prev = current;
            current=current.next;
        }
        
        return dummy.next;





        
    }
}