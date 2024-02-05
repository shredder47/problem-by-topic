package linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class FindStartOfCycleLLTest {

    FindStartOfCycleLLOptimized f = new FindStartOfCycleLLOptimized();
    FindStartOfCycleLL f2 = new FindStartOfCycleLL();

    @Test
    public void detectCycle1() {

        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeN4 = new ListNode(-4);
        head.next = node2;
        head.next.next = node0;
        head.next.next.next=nodeN4;
        head.next.next.next.next = node2;

        Assert.assertEquals(2,f.detectCycle(head).val);

    }


    @Test
    public void detectCycle2() {

        ListNode list = new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(1))));

        Assert.assertNull(f.detectCycle(list));

    }

    @Test
    public void detectCycle3() {

        ListNode list = new ListNode(1);

        Assert.assertNull(f.detectCycle(list));

    }

    @Test
    public void detectCycle11() {

        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeN4 = new ListNode(-4);
        head.next = node2;
        head.next.next = node0;
        head.next.next.next=nodeN4;
        head.next.next.next.next = node2;

        Assert.assertEquals(2,f2.detectCycle(head).val);

    }


    @Test
    public void detectCycle22() {

        ListNode list = new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(1))));

        Assert.assertNull(f2.detectCycle(list));

    }

    @Test
    public void detectCycle33() {

        ListNode list = new ListNode(1);

        Assert.assertNull(f2.detectCycle(list));

    }





}