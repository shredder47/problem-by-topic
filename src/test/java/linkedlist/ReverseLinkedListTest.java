package linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListTest {

    ReverseLinkedList r = new ReverseLinkedList();

    @Test
    public void test1() {

        ListNode l = new ListNode(1, new ListNode(2, new ListNode(3)));

        ListNode reversed = r.reverseList(l);

        Assert.assertEquals("3 2 1", LinkedListUtil.printLinkedList(reversed));


    }


}
