package linkedlist;

public class MergeInBetweenLL {

    //https://leetcode.com/problems/merge-in-between-linked-lists/

/*    Here's how it works:

            1. It first traverses list1 until it reaches the 'a'th node, which it stores as 'left'.
            2. It then traverses from 'a' to 'b' and stores the 'b'th node as 'middle'.
            3. Next, it connects the 'next' of the 'left' node to list2, beginning the merge of list2 at position 'a' in list1.
            4. It continues to traverse list2 until it reaches the end.
            5. Finally, it connects the end of list2 to the node next to 'middle', effectively ending the merge at position 'b' in list1.
    This method successfully merges list2 into list1 between positions 'a' and 'b'.*/

     public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
         ListNode left = list1;
         for (int i = 1; i < a; i++)
             left = left.next;

         ListNode middle = left;
         for (int i = a; i <= b; i++)
             middle = middle.next;

         left.next = list2;
         while (list2.next != null)
             list2 = list2.next;

         list2.next = middle.next;
         return list1;
        }


}
