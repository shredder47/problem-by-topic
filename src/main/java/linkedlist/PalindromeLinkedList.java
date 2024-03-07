package linkedlist;

public class PalindromeLinkedList {


    //https://leetcode.com/problems/palindrome-linked-list/description/

    // 1 -> 2 -> 2 -> 1

    public boolean isPalindrome(ListNode head) {

        //base case when only one item
        if (head == null ||head.next == null)
            return true;


        //finding mid
        ListNode mid = getMid(head);

        ListNode reverseHead = reverse(mid);

        //Traversing both and checking equality
        ListNode currentLeft = head;
        ListNode currentRight = reverseHead;


        while (currentLeft != null && currentRight != null){
            if(currentLeft.val != currentRight.val)
                return false;

            currentLeft = currentLeft.next;
            currentRight = currentRight.next;
        }

        return true;

    }

    //           s        f
    // 1 -> 2 -> 2 -> 1
    private ListNode getMid(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

        }

        return slow;

    }

    // 1 -> 2 -> 2 -> 1  --->  1 -> 2 (-> 2)   2 <-- 1

    private ListNode reverse(ListNode startingNode) {

        if (startingNode.next == null) return startingNode;

        ListNode prev = null;
        ListNode currentNode = startingNode;


        while (currentNode != null) {

            ListNode nextNode = currentNode.next;

            currentNode.next = prev;

            prev = currentNode;
            currentNode = nextNode;

        }

        return prev;

    }


}
