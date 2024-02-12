package binarytree;


//https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1

import java.util.*;

public class TopViewOfBinaryTree {


    /*

       1
    /     \
   2       3
  /  \    /   \
4    5  6   7

Top view will be: 4 2 1 3 7
 */

    public static ArrayList<Integer> topView(Node root) {

        Map<Integer, Integer> hdToValue = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        //Perform BFS / Level Order Traversal
        queue.add(new Pair(0, root));

        while (!queue.isEmpty()) {

            Pair hdAndNode = queue.poll();

            int currentHd = hdAndNode.horizontalDistance;
            Node currentNode = hdAndNode.node;

            //If the particular horizontal distance is not there , put that node.
            //Else keep it as it is, as its top view, the ones that was filled first should remain there.
            if (!hdToValue.containsKey(currentHd)) {
                hdToValue.put(currentHd, currentNode.data);
            }

            if (currentNode.left != null)
                queue.add(new Pair(currentHd - 1, currentNode.left));

            if (currentNode.right != null)
                queue.add(new Pair(currentHd + 1, currentNode.right));

        }

        ArrayList<Integer> topViewElements = new ArrayList<>();

        //As TreeSet, the elements will come as sorted i.e -2 -1 0 1 2
        for (Integer hd : hdToValue.keySet()) {
            Integer value = hdToValue.get(hd);
            topViewElements.add(value);
        }

        return topViewElements;

    }


    public static class Pair {

        int horizontalDistance;
        Node node;

        public Pair(int horizontalDistance, Node node) {
            this.horizontalDistance = horizontalDistance;
            this.node = node;
        }

    }

}

