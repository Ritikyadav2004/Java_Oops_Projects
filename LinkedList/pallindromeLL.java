package LinkedList;

public class pallindromeLL {
    

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

    public boolean isPalindrome(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        // move slow if it is odd length
        if(fast!=null){
            slow=slow.next;
        }

        // reversing the second half of node
        ListNode prev=null;
        ListNode nextNode=null;
        while(slow!=null)
        {
            nextNode=slow.next;
            slow.next=prev;
            prev=slow;
            slow=nextNode;
        }

        // noe our prev pointing to head of rever lll

        // now comapring 
        while(prev!=null)
        {
            if(head.val!=prev.val)
            {
                return false;
            }

            prev=prev.next;
            head=head.next;
        }



        return true;
    }
}