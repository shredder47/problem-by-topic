package linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeLinkedListTest {


    PalindromeLinkedList p = new PalindromeLinkedList();
    @Test
    public void isPalindrome() {

        ListNode list = new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(1))));

        Assert.assertTrue(p.isPalindrome(list));


    }

    @Test
    public void isPalindrome1() {

        ListNode list = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(1))));

        Assert.assertFalse(p.isPalindrome(list));


    }

    @Test
    public void isPalindrome3() {

        ListNode list = new ListNode(1,new ListNode(2,new ListNode(2)));

        Assert.assertFalse(p.isPalindrome(list));


    }

    @Test
    public void isPalindrome4() {

        ListNode list = new ListNode(1,new ListNode(2,new ListNode(1)));

        Assert.assertTrue(p.isPalindrome(list));


    }

    @Test
    public void isPalindrome5() {

        ListNode list = new ListNode(1);

        Assert.assertTrue(p.isPalindrome(list));


    }

    @Test
    public void isPalindrome6() {

        ListNode list = null;

        Assert.assertTrue(p.isPalindrome(list));


    }
}