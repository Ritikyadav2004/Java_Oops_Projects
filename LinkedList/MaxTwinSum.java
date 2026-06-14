package LinkedList;

public class MaxTwinSum {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int pairSum(ListNode head) {
        // /. simpy strategy is to
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        ListNode prev = null;
        ListNode nextNode = slow;

        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        int max = 0;
        while (prev != null && head != null) {
            int num = head.val + prev.val;
            max = Math.max(max, num);
            head = head.next;
            prev = prev.next;
        }

        return max;
    }
}
