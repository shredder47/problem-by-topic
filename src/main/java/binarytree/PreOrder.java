package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {

    /*

                5
               / \
              3   6
             / \
            1   4

     */

    public List<Integer> preorderTraversal(TreeNode<Integer> root) {

        List<Integer> preOrderList = new ArrayList<>();
        Stack<TreeNode<Integer>> stack = new Stack<>();

        if (root == null) {
            return preOrderList;
        }

        TreeNode<Integer> currentNode = root;

        while (currentNode != null || !stack.isEmpty()) {

            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode<Integer> node = stack.pop();
                currentNode = node.right;
            }
        }
        return preOrderList;
    }

}

