class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if (head == null) {
            return null;
        }
        int cnt = 0;
        ListNode temp = head;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        if (cnt == n) {
           ListNode newhead = head.next;
            head = null;
            return newhead;
        }

        int res = cnt - n;
        temp = head;

        while (temp != null) {
            res--;
            if (res == 0) {
                break;
            }
            temp = temp.next;
        }

        
        ListNode delNode = temp.next;
        temp.next = temp.next.next;
        delNode = null;
        return head;
    }
}
