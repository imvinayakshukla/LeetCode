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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> num = new HashSet<>();
        for (int a : nums)
            num.add(a);
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            if (num.contains((int) itr.next()))
                itr.remove();

        }
        System.out.println(list);

        ListNode ans = new ListNode(list.get(0));

        temp = ans;

        for (int i = 1; i < list.size(); i++) {
            ListNode cal = new ListNode(list.get(i));
            temp.next = cal;
            temp = cal;
        }

        return ans;
    }
}