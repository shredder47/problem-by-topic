package linkedlist;






/*
    Input: head = [1,2,3,4,5]
    Output: [3,4,5]
    Explanation: The middle node of the list is node 3.

    //https://leetcode.com/problems/middle-of-the-linked-list/solutions/

 */


public class MiddleOfLinkedList {

//-----for EVEN
//   fs
//    1 -->  2 --> 3 --> 4 --> 5

//           s     f
//    1 -->  2 --> 3 --> 4 --> 5

//                 s           f
//    1 -->  2 --> 3 --> 4 --> 5   no more fast movement as fast != null is true but fast.next !=null is false

//------ for ODD
//   fs
//    1 -->  2 --> 3 --> 4 --> 5 --> 6

//           s     f
//    1 -->  2 --> 3 --> 4 --> 5 --> 6

//                 s           f
//    1 -->  2 --> 3 --> 4 --> 5 --> 6

//                       s                  f
//    1 -->  2 --> 3 --> 4 --> 5 --> 6 --> null  No more fast movement as fast!=null is false now

    public ListNode middleNode(ListNode head) {

        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;

    }


}
