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

    // Question can also be PreOrder using single stack
    public List<Integer> preorderTraversal(TreeNodeGeneric<Integer> root) {

        List<Integer> preOrderList = new ArrayList<>();
        Stack<TreeNodeGeneric<Integer>> stack = new Stack<>();

        if (root == null) {
            return preOrderList;
        }

        TreeNodeGeneric<Integer> currentNode = root;

        while (currentNode != null || !stack.isEmpty()) {

            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNodeGeneric<Integer> node = stack.pop();
                currentNode = node.right;
            }
        }
        return preOrderList;
    }

}

