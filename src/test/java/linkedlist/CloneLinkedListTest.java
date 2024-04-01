package linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CloneLinkedListTest {

    /**
     * This is a test class for CloneLinkedList.
     * Specific method being tested is the `clone` method.
     */



    @Test
    public void testSingleElementListClone() {
        ListNode node = new ListNode(1);
        ListNode clone = CloneLinkedList.clone(node);
        assertEquals(1, clone.val);
        assertNull(clone.next);
    }

    @Test
    public void testMultipleElementListClone() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);

        // printLinkedListItems(head);
        ListNode clone = CloneLinkedList.clone(head);
        Assert.assertEquals("0 1 2 3 4",LinkedListUtil.printLinkedList(clone));
    }


}