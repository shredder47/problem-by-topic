package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder {
    //https://leetcode.com/problems/binary-tree-inorder-traversal/description/

    /*

                5
               / \
              3   6
             / \
            1   4

     */

    public List<Integer> inorderTraversal(TreeNodeGeneric<Integer> root) {

        List<Integer> inOrderResult = new ArrayList<>();
        Stack<TreeNodeGeneric<Integer>> stack = new Stack<>();

        if (root == null) {
            return inOrderResult;
        }

        TreeNodeGeneric<Integer> currentNode = root;

        while (currentNode != null || !stack.isEmpty()) {

            // Go to left till it becomes null, once we reach null, pop the value,and go it its right..then repeat going that elements left is present
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNodeGeneric<Integer> node = stack.pop();
                inOrderResult.add(node.val);
                currentNode = node.right;
            }
        }
        return inOrderResult;
    }

}

