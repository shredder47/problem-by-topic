package linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MergeInBetweenLLTest {

    @Test
    public void testMergeInBetween() {
        // Create linked lists
        ListNode list1 = new ListNode(10, new ListNode(1, new ListNode(13, new ListNode(6, new ListNode(9,new ListNode(5))))));
        ListNode list2 = new ListNode(1000000, new ListNode(1000001, new ListNode(1000002)));

        // Create instance of MergeInBetweenLL
        MergeInBetweenLL mergeInBetweenLL = new MergeInBetweenLL();

        // Call mergeInBetween method
        ListNode result = mergeInBetweenLL.mergeInBetween(list1, 3, 4, list2);
        Assert.assertEquals("10 1 13 1000000 1000001 1000002 5",LinkedListUtil.printLinkedList(result));


    }
}