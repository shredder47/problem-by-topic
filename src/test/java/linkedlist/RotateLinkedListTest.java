package linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateLinkedListTest {

    RotateLinkedList r = new RotateLinkedList();
    @Test
    public void rotateRight1() {
        ListNode list = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode listNode = r.rotateRight(list, 2);
        Assert.assertEquals("4 5 1 2 3",LinkedListUtil.printLinkedList( listNode));
    }

    @Test
    public void rotateRight2() {
        ListNode list = new ListNode(0,new ListNode(1,new ListNode(2)));
        ListNode listNode = r.rotateRight(list, 4);
        Assert.assertEquals("2 0 1",LinkedListUtil.printLinkedList( listNode));
    }

    @Test
    public void rotateRight3() {
        ListNode list = new ListNode(1);
        ListNode listNode = r.rotateRight(list, 0);
        Assert.assertEquals("1",LinkedListUtil.printLinkedList( listNode));
    }

    @Test
    public void rotateRight4() {
        ListNode list = new ListNode(1);
        ListNode listNode = r.rotateRight(list, 1);
        Assert.assertEquals("1",LinkedListUtil.printLinkedList( listNode));
    }
}