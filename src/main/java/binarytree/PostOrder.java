package binarytree;

import java.util.*;

public class PostOrder {

    /*

                5
               / \
              3   6
             / \
            1   4

     */

    public List<Integer> postorderTraversal(TreeNode<Integer> root) {

        List<Integer> postOrderList = new ArrayList<>();
        Stack<TreeNode<Integer>> stack = new Stack<>();

        if (root == null) {
            return postOrderList;
        }

        stack.push(root);

        while (!stack.isEmpty()){

            TreeNode<Integer> pop = stack.pop();
            postOrderList.add(pop.val);

            if(pop.left != null)
                stack.add(pop.left);

            if(pop.right != null)
                stack.push(pop.right);

        }

        Collections.reverse(postOrderList);

        return postOrderList;
    }

}

