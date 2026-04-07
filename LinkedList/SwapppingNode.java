package LinkedList;

public class SwapppingNode {
// class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        // code here
        Node first=head;
        Node prev=null;
        while(first!=null && first.next!=null)
        {
            Node second=first.next;
            first.next=second.next;
            second.next=first;
            if(prev==null)// mean prev starting me he 
            {
               head=second;  // yeh ab 1st time me head ban chuka he and first second Elemenmt
            }
            else
            {
                // matlab prev  null nhi he 
                prev.next=second;
                
            }
            // so prev ab point kerga first node ko jo swapped hoke 2nd node ban chuka he 
                prev=first;
                // first ko move kernge to
                first=first.next;// now again upper second=first.next similer case banega upper vala
        }
        return head;
        
    }
}
//  node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

