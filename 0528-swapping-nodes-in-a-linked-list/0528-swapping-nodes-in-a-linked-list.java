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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int i = 0;
        int a[] = new int[size];
        temp = head;

        while (temp != null) {
            a[i++] = temp.val;
            temp = temp.next;
        }

        
        int second = size - k ;
        int stemp = a[second];
        a[second] = a[k-1];
        a[k-1] = stemp;

        ListNode ans = new ListNode(a[0]);
       ListNode result=ans;

        for (int j = 1; j < a.length; j++) {
            ListNode b = new ListNode(a[j]);
            ans.next = b;
            ans = ans.next;
        }
        return result;

    }
}
