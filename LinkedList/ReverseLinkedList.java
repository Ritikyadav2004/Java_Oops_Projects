// Problem :-https://leetcode.com/problems/reverse-linked-list/description/
// Explnantion :-https://www.youtube.com/watch?v=6GkwvqS9Cq4&list=PLQ7ZAf76c0ZPqu_4KHicqxtJRaV2meb7x&index=147
package LinkedList;
public class ReverseLinkedList {
    
}

//   Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    
    public ListNode reverseList(ListNode head) {
        ListNode curNode=head;
        ListNode prev=null;
        ListNode nextNode=null;
        while(curNode!=null)
        {
            nextNode=curNode.next;
            curNode.next=prev;
            prev=curNode;
            curNode=nextNode;

        }
        return prev;
    }
}