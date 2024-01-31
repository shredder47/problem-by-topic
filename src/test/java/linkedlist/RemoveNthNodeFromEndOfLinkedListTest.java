package linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class RemoveNthNodeFromEndOfLinkedListTest {

    RemoveNthNodeFromEndOfLinkedList r = new RemoveNthNodeFromEndOfLinkedList();

    @Test
    public void removeNthFromEnd1() {

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode listNode = r.removeNthFromEnd(list1, 2);

        Assert.assertEquals("1 2 3 5", LinkedListUtil.printLinkedList(listNode));

    }

    @Test
    public void removeNthFromEnd2() {

        ListNode list1 = new ListNode(1);

        ListNode listNode = r.removeNthFromEnd(list1, 1);

        Assert.assertEquals("", LinkedListUtil.printLinkedList(listNode));

    }
}