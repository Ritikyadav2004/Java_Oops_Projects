// Problem : https://leetcode.com/problems/palindrome-linked-list/
// Soltuion : https://www.youtube.com/watch?v=uXB8S875uyw&list=PLQ7ZAf76c0ZPqu_4KHicqxtJRaV2meb7x&index=148
package LinkedList;

public class PallindromeLinkedList {
    


// * Definition for singly-linked list.
 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

    public boolean isPalindrome(ListNode head) {
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        ListNode newHead=null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;

            if(newHead==null)
            {
                newHead= new ListNode(prev.val);
            }
            else
            {
                ListNode node= new ListNode(prev.val);
                node.next=newHead;
                newHead=node;
            }
        }
        // SLow ek peeche rehata he 
        if(fast!=null)
        {
            slow=slow.next;
        }
        while(slow!=null && newHead!=null)
        {
            if(slow.val!=newHead.val)
            {
                return false;
            }
            slow=slow.next;
            newHead=newHead.next;
        }
        return true;
        // checking
    }
}