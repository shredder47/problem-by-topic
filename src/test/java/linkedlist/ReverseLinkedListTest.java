package linkedlist;

import array.MergeIntervals;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ReverseLinkedListTest {

    ReverseLinkedList r = new ReverseLinkedList();

    @Test
    public void test1() {

        ReverseLinkedList.ListNode l = new ReverseLinkedList.ListNode(1,new ReverseLinkedList.ListNode(2,new ReverseLinkedList.ListNode(3)));

        ReverseLinkedList.ListNode reversed = r.reverseList(l);

        Assert.assertEquals("3 2 1 ",r.printLinkedList(reversed));



    }


}
