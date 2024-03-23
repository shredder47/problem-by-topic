package linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class ReOrderListTest {


    ReOrderList r = new ReOrderList();

    @Test
    public void reorder() {
        ListNode list = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));

        r.reorderList(list);
        Assert.assertEquals("1 5 2 4 3",LinkedListUtil.printLinkedList(list));
    }
}