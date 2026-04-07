package LinkedList;
//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
//2095. Delete the Middle Node of a Linked List

public class DeletingMiddleElement
{

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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null)
        {
           
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast = fast.next.next;
        }
        if(prev==null)
        {
           head=null; // mean only sinlge node
        }
        else{
        prev.next=slow.next;
        slow=null;
        }
        return head;
    }

    // it will return the head from where printing of the list started after removing middle element
}