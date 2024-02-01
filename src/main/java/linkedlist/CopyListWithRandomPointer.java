package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {


    public Node copyRandomList(Node head) {

        Map<Node, Node> oldToNewMap = new HashMap<>();
        oldToNewMap.put(null, null);


        //Pass one: Create clone of old's object(forget about random pointer)

        Node cur = head;
        while (cur != null) {

            oldToNewMap.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;


        //Pass two: mutating new object by sequentially traversing old node and getting its information for mapping it to new one
        while (cur != null) {

            Node cloned = oldToNewMap.get(cur);
            cloned.next = oldToNewMap.get(cur.next);
            cloned.random = oldToNewMap.get(cur.random);

            cur = cur.next;

        }

        return oldToNewMap.get(head);
    }


}
