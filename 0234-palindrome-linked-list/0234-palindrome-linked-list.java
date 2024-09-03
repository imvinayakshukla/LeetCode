class Solution {
    public static ListNode reverseList(ListNode slow)
    {
        ListNode current=slow,prev=null,next=null;

        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;

    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next != null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.val);
       
        
        slow=reverseList(slow);
        fast=head;

        while(slow!=null)
        {
            if(fast.val!=slow.val)
            return false;
            fast=fast.next;
            slow=slow.next;
        }

        return true;
    }

}