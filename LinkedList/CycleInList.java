package LinkedList;
import java.util.HashSet;
public class CycleInList {
    

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

    public ListNode detectCycle(ListNode head) {
        // ListNode slow=head,fast=head;
        HashSet<ListNode> set= new HashSet<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(!set.contains(temp))
            {
                set.add(temp);
            }
            if(set.contains(temp.next))
            {
                return temp.next;
            }
            temp=temp.next;
        }
        return null;
        }
        


    }
