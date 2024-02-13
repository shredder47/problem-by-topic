package binarytree;


//https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

import java.util.*;

public class BottomViewOfBinaryTree {


/*

       10
    /      \
  20        30
 /   \    /    \
40   60  90    100

Bottom view will be: 40 20 90 30 100

 */

    public static ArrayList<Integer> bottomView(Node root) {

        Map<Integer, Integer> hdToValue = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        //Perform BFS / Level Order Traversal
        queue.add(new Pair(0, root));

        while (!queue.isEmpty()) {

            Pair hdAndNode = queue.poll();

            int currentHd = hdAndNode.horizontalDistance;
            Node currentNode = hdAndNode.node;

            //Keep filling the freshly found vales for every horizontal values we get
            hdToValue.put(currentHd, currentNode.data);


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

