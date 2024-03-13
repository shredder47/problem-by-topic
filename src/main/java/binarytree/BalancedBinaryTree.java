package binarytree;

public class BalancedBinaryTree {
    //https://leetcode.com/problems/balanced-binary-tree/description/


    /*


            3
           / \
          9   20
              / \
             15  7


     */

      /*

                1
               / \
              2   3
             / \
            4   5
           /
          6
         */

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int height = height(root);

        return height != -1;
    }

    private int height(TreeNode node) {

        if (node == null)
            return 0;

        int left = height(node.left);
        int right = height(node.right);

        if (left == -1 || right == -1)
            return -1;

        if ((left - right) > 1 || (left - right) < -1)
            return -1;
        else
            return 1 + Math.max(left, right);
    }

}
