package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedList {


    /**
     * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
     * Output: Intersected at '8'
     *
     *  4 -> 1 -> 8 -> 4 -> 5
     *
     *  5 -> 6 -> 1 -> 8 -> 4 -> 5
     *
     */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> visited = new HashSet<>();


        ListNode current = headA;

        while (current.next != null){

            visited.add(current);
            current = current.next;
        }


        current = headB;
        while (current.next !=null){

            if(visited.contains(current)) return current;
            current = current.next;
        }

        return null;
    }



}
