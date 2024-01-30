package linkedlist;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//https://leetcode.com/problems/reverse-linked-list/description/

public class ReverseLinkedList {

    // 1 -> 2 -> 3    == 3 -> 2 -> 1


    public ListNode reverseList(ListNode head) {

        //int
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            //Preserving all next nodes addresses
            ListNode next = current.next;

            //actual reversing
            current.next = prev;

            //preparing for next phase
            prev = current;
            current = next;

        }

        return prev;
    }

    public static class ListNode {
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

    public String printLinkedList(ListNode head) {

        ListNode currentNode = head;
        StringBuilder sb = new StringBuilder();

        while (currentNode != null) {
            sb.append(currentNode.val).append(" ");
            currentNode = currentNode.next;
        }

        return sb.toString();
    }
}
