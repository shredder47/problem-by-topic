package linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class DeleteNodeNoHeadProvidedTest {

    DeleteNodeNoHeadProvided d = new DeleteNodeNoHeadProvided();
    @Test
    public void deleteNode() {


        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));

        d.deleteNode(list1.next.next);// delete 3
        Assert.assertEquals("1 2 4 5",LinkedListUtil.printLinkedList(list1));

    }
}