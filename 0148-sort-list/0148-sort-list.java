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

    public static ListNode mergetwolist(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }
        if (list1!=null)
        {
             temp.next = list1;
                temp = list1;
                list1 = list1.next;
        }
        else
        {
              temp.next = list2;
                temp = list2;
                list2 = list2.next;
        }
    return dummy.next;
    }

    public static ListNode findmiddle(ListNode head) {

        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next!=null) {

            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode middle = findmiddle(head);

        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;

        left = sortList(left);
        right = sortList(right);

        return mergetwolist(left, right);

    }
}