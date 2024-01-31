package linkedlist;

public class DetectCycleInLinkedList {

    //https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;


        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) return true;

        }

        return false;

    }


}
