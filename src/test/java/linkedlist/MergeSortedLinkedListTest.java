package linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedLinkedListTest {

    MergeSortedLinkedList m = new MergeSortedLinkedList();
    @Test
    public void mergeTwoLists() {

        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4)));

        ListNode merged = m.mergeTwoLists(list1, list2);

        Assert.assertEquals("1 1 2 3 4 4",LinkedListUtil.printLinkedList(merged));
    }
}