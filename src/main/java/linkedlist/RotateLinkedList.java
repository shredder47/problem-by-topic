package linkedlist;

public class RotateLinkedList {
    //                         s           f
    //                         |           |
    //             1 --> 2 --> 3     4 --> 5
    //             _____________     +++++++
    //
    //                               4 --> 5 -> 1 --> 2 --> 3 -> null
    //                               +++++++++  _____________

    public  ListNode  rotateRight(ListNode head, int k) {

        if(head == null) return null;
        if(k == 0) return head;

        ListNode fast = head;
        ListNode slow = head;

        // 1 -> 2 -> 3 -> 4 -> 5
        //giving fast a lead of k
        for (int i = 0; i < k; i++) {
            if (fast.next == null)
                fast = head;
            else
                fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        if(slow.next != null){
            ListNode newHead = slow.next;
            slow.next = null;
            fast.next = head;

            head = newHead;
        }

        return head;
    }
}
