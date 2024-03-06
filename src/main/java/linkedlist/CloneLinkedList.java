package linkedlist;

public class CloneLinkedList {


    public static ListNode clone(ListNode head) {

        ListNode dummy = new ListNode();

        ListNode cur = head;
        ListNode cloneCur = dummy;

        while (cur !=null){

            cloneCur.next = new ListNode(cur.val);
            cur = cur.next;
            cloneCur = cloneCur.next;
        }

        return dummy.next;
    }

    private static void printLinkedListItems(ListNode head){

        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }

    }


    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);

       // printLinkedListItems(head);
        ListNode clone = clone(head);
        printLinkedListItems(clone);


    }
}
