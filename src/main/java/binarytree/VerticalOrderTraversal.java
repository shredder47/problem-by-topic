package binarytree;

import java.util.*;

public class VerticalOrderTraversal {
/// https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/


//    Input: root = [3,9,20,null,null,15,7]
//    Output: [[9],[3,15],[20],[7]]
//    Explanation:
//    Column -1: Only node 9 is in this column.
//            Column 0: Nodes 3 and 15 are in this column in that order from top to bottom.
//    Column 1: Only node 20 is in this column.
//            Column 2: Only node 7 is in this column.


    public List<List<Integer>> verticalTraversal(TreeNode root) {

        if (root.left == null && root.right == null)
            return Collections.singletonList(Collections.singletonList(root.val));

        int level = 1;

        Queue<Triple> queue = new LinkedList<>();

        // This will contain all elements for each horizontal distance
        TreeMap<Integer, PriorityQueue<Triple>> hdToTriple = new TreeMap<>();

        // adding the root with level 0 and hd 0, standard BFS Stuff!
        queue.add(new Triple(0, 0, root));
        // This will help when to increase the level
        queue.add(null);

        while (!queue.isEmpty()) {

            Triple poll = queue.poll();

            // if current triple is empty it means new level will start or its the end of
            // queue
            if (poll == null) {
                // if queue is empty then all elements consumed, we can break
                if (queue.isEmpty())
                    break;
                // add new null to mark a new level EX: [NULL] 2 3 -> pop NULL -> 2 3 NULL
                queue.add(null);
                // increasing the level as we encountered null
                level++;
                continue;
            }

            int currentHd = poll.hd;
            TreeNode currentNode = poll.node;

            // If HD key is there ,add node to the PQ else create and put
            if (hdToTriple.containsKey(currentHd)) {
                hdToTriple.get(currentHd).add(poll);
            } else {
                PriorityQueue<Triple> list = new PriorityQueue<>(
                        Comparator.comparingInt(Triple::getLevel).thenComparing(x -> x.node.val));
                list.add(poll);
                hdToTriple.put(currentHd, list);
            }

            if (currentNode.left != null)
                queue.add(new Triple(level, currentHd - 1, currentNode.left));

            if (currentNode.right != null)
                queue.add(new Triple(level, currentHd + 1, currentNode.right));

        }

        List<List<Integer>> verticalOrder = new ArrayList<>();

        for (Integer hd : hdToTriple.keySet()) {

            List<Integer> currentHdElements = new ArrayList<>();
            PriorityQueue<Triple> elements = hdToTriple.get(hd);

            // Polling one by one for getting correct order , remember heap operation ?
            while (!elements.isEmpty()) {
                Triple poll = elements.poll();
                currentHdElements.add(poll.node.val);
            }
            verticalOrder.add(currentHdElements);
        }

        return verticalOrder;

    }

    public class Triple {

        int level;

        int hd;
        TreeNode node;

        public Triple(int level, int hd, TreeNode node) {
            this.level = level;
            this.hd = hd;
            this.node = node;
        }

        public int getLevel() {
            return level;
        }

        public int getHd() {
            return hd;
        }

        public TreeNode getNode() {
            return node;
        }
    }

}
