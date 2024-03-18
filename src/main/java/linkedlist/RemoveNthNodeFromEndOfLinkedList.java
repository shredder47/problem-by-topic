package linkedlist;

public class RemoveNthNodeFromEndOfLinkedList {
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
    /**
     *
     * Input: head = [1,2,3,4,5], n = 2
     * Output: [1,2,3,5]
     * Example 2:
     * <p>
     * Input: head = [1], n = 1
     * Output: []
     * Example 3:
     * <p>
     * Input: head = [1,2], n = 1
     * Output: [1]
     */


    public ListNode removeNthFromEnd(ListNode head, int n) {

       ListNode slow = head;
       ListNode fast = head;

//    1 -->  2 --> 3 --> 4 --> 5 --> 6

        //giving fast a lead by n
        for (int i = 0; i <n; i++) {
            fast = fast.next;
        }


        // IN CASE WHEN N MATCHES the length of LinkedList,then its basically deleting the head...
        if(fast == null ) return head.next;

        //move one by one
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        //deletion
        slow.next = slow.next.next;


        return head;
    }


}
