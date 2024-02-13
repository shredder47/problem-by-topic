package binarytree;

import java.util.*;

//https://leetcode.com/problems/binary-tree-level-order-traversal/description/
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {


        if (root == null)
            return Collections.emptyList();

        if (root.left == null && root.right == null)
            return Collections.singletonList(Collections.singletonList(root.val));

        List<List<Integer>> allLevelElements = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);

        List<Integer> currentLevelElements = new ArrayList<>();

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            if (node != null) {

                currentLevelElements.add(node.val);

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            } else { // If Node is null, i.e. end of a level

                if (queue.isEmpty()) {
                    allLevelElements.add(currentLevelElements);
                    break;
                } else {
                    queue.add(null);
                    allLevelElements.add(currentLevelElements);
                    currentLevelElements = new ArrayList<>();
                }
            }
        }

        return allLevelElements;
    }


}
