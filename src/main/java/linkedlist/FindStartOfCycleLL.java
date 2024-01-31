package linkedlist;

public class FindStartOfCycleLL {

    public ListNode detectCycle(ListNode head) {

        if(head == null ||head.next == null) return null;

        ListNode meetingPoint;

        //checking if there is a cycle
        ListNode cycle = getCycle(head);

        if(cycle != null)
            meetingPoint = cycle;
        else
            return null; // No intersectionPoint

        //We will now traverse from original head and meeting point at same pace, the point where it meets is the required place

        ListNode ptr1 = head;
        ListNode ptr2 = meetingPoint;

        while (ptr1 != null && ptr2 != null){

            if(ptr1 == ptr2)
                return ptr1; //First Intersection Point

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return null; // No intersectionPoint
    }


    private ListNode getCycle(ListNode head) {


        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast)
                return slow;

        }
        return null;
    }


}
