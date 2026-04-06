package LinkedList;
/*
Name    :- 876. Middle of the Linked List
Question:- https://leetcode.com/problems/middle-of-the-linked-list/
Solution:- https://www.youtube.com/watch?v=NUbqd8-lHl4
*/


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 

public class MidilElement
{
       

    public ListNode middleNode(ListNode head) {
        // WE WIL USING THE CONCEPT OF  FAST AND SLOW
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}