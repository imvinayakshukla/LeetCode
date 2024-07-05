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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode previousNode = head;
        ListNode currentNode = head.next;
        int firstCriticalIndex = 0, lastCriticalIndex = 0;
        int index = 1;

        int[] answer = new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE };

        while (currentNode.next != null) {
            if (currentNode.val < Math.min(previousNode.val, currentNode.next.val)
                    || currentNode.val > Math.max(previousNode.val, currentNode.next.val)) {
                if (lastCriticalIndex == 0) {
                    firstCriticalIndex = index;
                    lastCriticalIndex = index;
                } else {
                    answer[0] = Math.min(answer[0], index - lastCriticalIndex);
                    answer[1] = index - firstCriticalIndex;
                    lastCriticalIndex = index;
                }
            }
            ++index;
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        return firstCriticalIndex == lastCriticalIndex ? new int[] { -1, -1 } : answer;
    }
}