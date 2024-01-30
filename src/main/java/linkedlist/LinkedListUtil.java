package linkedlist;

public class LinkedListUtil {

    public static String printLinkedList(ListNode head) {

        ListNode currentNode = head;
        StringBuilder sb = new StringBuilder();

        while (currentNode != null) {
            sb.append(currentNode.val).append(" ");
            currentNode = currentNode.next;
        }

        return sb.toString().trim();
    }

}
