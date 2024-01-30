package linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MiddleOfLinkedListTest  {


    MiddleOfLinkedList m = new MiddleOfLinkedList();
    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode mid = m.middleNode(head);

        Assert.assertEquals(3,mid.val);

    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,new ListNode(6))))));

        ListNode mid = m.middleNode(head);

        Assert.assertEquals(4,mid.val);

    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);

        ListNode mid = m.middleNode(head);

        Assert.assertEquals(1,mid.val);

    }

}