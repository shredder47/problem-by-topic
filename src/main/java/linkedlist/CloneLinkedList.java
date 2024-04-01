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

}
