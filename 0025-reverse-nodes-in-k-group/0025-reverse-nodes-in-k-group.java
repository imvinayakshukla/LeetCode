/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null, next = null, current = head;
        
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
       
        return prev;

    }

    static ListNode findKthNode(ListNode temp, int k) {

        k -= 1;

        while (temp != null && k > 0) {
            k--;

            temp = temp.next;
        }

        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null,newHead=null;
        while (temp != null) {
            ListNode kthnode = findKthNode(temp, k);

            if (kthnode == null) {

                if (prevLast != null) {
                    prevLast.next = temp;
                }

                break;
            }
            ListNode nextNode = kthnode.next;
            kthnode.next = null;

           ListNode reverse= reverseLinkedList(temp);
             
            
            if (newHead == null) {
                newHead = reverse;
            }

            if (prevLast != null) {
                prevLast.next = reverse;
            }

            prevLast = temp;
            temp.next = nextNode;
            temp = nextNode;
        }
            
        

        return newHead != null ? newHead : head;

    }

}
