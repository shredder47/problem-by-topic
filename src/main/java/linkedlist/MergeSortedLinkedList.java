package linkedlist;

public class MergeSortedLinkedList {

    /*

        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]
        Example 2:

        Input: list1 = [], list2 = []
        Output: []
        Example 3:

        Input: list1 = [], list2 = [0]
        Output: [0]
     */


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null & list2 == null) return null;

        ListNode newNode = new ListNode();

        // For traversing
        ListNode currentNode = newNode;

        // Traverse when both nodes are not empty

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {

                currentNode.next = new ListNode(list1.val);
                list1 = list1.next;
                currentNode = currentNode.next;

            } else {
                currentNode.next = new ListNode(list2.val);
                list2 = list2.next;
                currentNode = currentNode.next;

            }
        }

        if (list1 != null) {
            currentNode.next = list1;
        }

        if (list2 != null) {
            currentNode.next = list2;
        }

        //as first value was placeholder/null
        return newNode.next;

    }

}
