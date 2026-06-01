package LinkedList;
import java.util.*;
public class intersactionOfLinkedList {
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      HashSet<ListNode> map= new HashSet<>();
      while(headA!=null)
      {
        map.add(headA);
        {
            headA=headA.next;
        }
      } 
      while(headB!=null)
      {
        if(map.contains(headB))
        {
            return headB;
        }

        headB=headB.next;
      }
      return null;
    }
    
}