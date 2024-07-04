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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode left=head,right=head;
        ListNode ansH=dummy;
        int sum;
        while(left!=null && right!=null)
        {
            sum=0;
          while(right.val!=0)
          {
                right=right.next;
          }

          while(left!=right)
          {

            left=left.next;
            sum+=left.val;
            

          }
          right=right.next;
          System.out.println(sum);
          if(sum!=0){
          ListNode temp=new ListNode(sum);
          dummy.next=temp;
          dummy=temp;
          
          }
          

        }

        return ansH.next;
        
    }
}