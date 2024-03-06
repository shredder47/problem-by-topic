package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    //https://leetcode.com/problems/copy-list-with-random-pointer/description/

    public Node copyRandomList(Node head) {

        Map<Node, Node> oldToNewMap = new HashMap<>();
        oldToNewMap.put(null, null);


        //Pass one: Create clone of old's object(forget about random pointer)

        Node oldCur = head;
        while (oldCur != null) {

            oldToNewMap.put(oldCur, new Node(oldCur.val));
            oldCur = oldCur.next;
        }

        oldCur = head;

        //Pass two: mutating new object by sequentially traversing old node and getting its information for mapping it to new one
        while (oldCur != null) {

            Node newObject = oldToNewMap.get(oldCur);

            newObject.next = oldToNewMap.get(oldCur.next);
            newObject.random = oldToNewMap.get(oldCur.random);

            oldCur = oldCur.next;

        }

        return oldToNewMap.get(head);
    }


}
