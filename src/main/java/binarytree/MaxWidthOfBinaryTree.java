package binarytree;

import java.util.*;

//https://leetcode.com/problems/maximum-width-of-binary-tree/description/
public class MaxWidthOfBinaryTree {

    public int widthOfBinaryTree(TreeNode root) {

        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;

        int maxWidth = 0;
        int level = 1;

        Queue<Triple> queue = new LinkedList<>();

        //lets do level order traversal or BFS
        queue.add(new Triple(1, level, root));
        queue.add(null);

        //This will store all the elements of a level
        List<Triple> currentLevelElements = new ArrayList<>();

        while (!queue.isEmpty()) {

            Triple poll = queue.poll();

            if (poll == null) {
                //if we receive null and the queue is empty that means end of tree
                if (queue.isEmpty()) {
                    int width = getWidth(currentLevelElements);
                    maxWidth = Math.max(maxWidth, width);

                    return maxWidth;

                } else {

                    int width = getWidth(currentLevelElements);
                    maxWidth = Math.max(maxWidth, width);
                    // marking the starting of another level
                    queue.add(null);
                    // not required to track level for this problem :)
                    level++;
                    //emptying the list for new tracking
                    currentLevelElements.clear();
                }
            } else {

                int currentNodeNum = poll.getNodeNumber();
                TreeNode currentNode = poll.getNode();

                //add the element to the current level elements
                currentLevelElements.add(poll);

                //Node number of left child is parent number * 2
                if (currentNode.left != null)
                    queue.add(new Triple(2 * currentNodeNum, level, currentNode.left));

                //Node number of right child is parent (number * 2) + 1
                if (currentNode.right != null)
                    queue.add(new Triple(2 * currentNodeNum + 1, level, currentNode.right));
            }


        }

        return maxWidth;
    }

    /*      val,level,[node_number]
            NUMBERS IN [] MEANS NODE NUMBER
                  1,1,[1]               WIDTH  1-1 + 1 = 1
                 /     \
             2,2,[2]   3,2,[3]          WIDTH  3-2 + 1 = 2
            /     \        \
        4,3,[4]   5,3,[5]  6,3,[7]      WIDTH  7-4 + 1 = 4
     */
    // Calculates left - right distance
    public static int getWidth(List<Triple> nodes) {

        Triple leftMost = nodes.get(0);
        Triple rightMost = nodes.get(nodes.size() - 1);

        return rightMost.nodeNumber - leftMost.nodeNumber + 1;
    }

    public static class Triple {

        int nodeNumber;

        //Not required for this problem
        int level;
        TreeNode node;

        public Triple(int nodeNumber, int level, TreeNode node) {
            this.nodeNumber = nodeNumber;
            this.level = level;
            this.node = node;
        }

        public int getNodeNumber() {
            return nodeNumber;
        }

        public int getLevel() {
            return level;
        }

        public TreeNode getNode() {
            return node;
        }
    }
}
