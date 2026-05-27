package LinkedList;

public class SegregateEvenAndOdd {
    
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

    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode oddNode=head , even=head.next,  evenHead=even;
        while(even!=null &&  even.next!=null)
        {
            oddNode.next=even.next;
            oddNode=oddNode.next;
            even.next=even.next.next;
            even=even.next;
        }

       oddNode.next=evenHead;
       return head;
    }
}