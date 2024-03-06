package linkedlist;

public class FindStartOfCycleLLOptimized {

    //https://leetcode.com/problems/linked-list-cycle-ii/description/

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        if (head.next == head) {
            return head;
        }

        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer.next != null && fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (fastPointer == slowPointer) {//we have got into a circle

                //starting slow from head , and first as where it is currently
                slowPointer = head;

                while (fastPointer != null && slowPointer != null) {

                    if (fastPointer == slowPointer)
                        return fastPointer;

                    slowPointer = slowPointer.next;
                    fastPointer = fastPointer.next;
                }
            }
        }
        return null;
    }

}
