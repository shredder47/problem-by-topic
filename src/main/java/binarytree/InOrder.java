package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder {

    /*

                5
               / \
              3   6
             / \
            1   4

     */

    public List<Integer> inorderTraversal(TreeNode <Integer>root) {

        List<Integer> inOrderResult = new ArrayList<>();
        Stack<TreeNode<Integer>> stack = new Stack<>();

        if (root == null) {
            return inOrderResult;
        }

        TreeNode<Integer> currentNode = root;

        while (currentNode != null || !stack.isEmpty()) {

            // Go to left till it becomes null, once we reach null, pop the value,and go it its right..then repeat going that elements left is present
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode<Integer> node = stack.pop();
                inOrderResult.add(node.val);
                currentNode = node.right;
            }
        }
        return inOrderResult;
    }

}

