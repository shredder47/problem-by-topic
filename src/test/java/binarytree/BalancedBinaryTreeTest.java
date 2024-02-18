package binarytree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBinaryTreeTest {

    BalancedBinaryTree b = new BalancedBinaryTree();

    @Test
    public void isBalancedFalse() {

          /*

                1
               / \
              2   3
             / \
            4   5
           /
          6
         */


        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);


        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        four.left = six;

        Assert.assertFalse(b.isBalanced(one));

    }

    @Test
    public void isBalancedTrue() {

          /*

                1
               / \
              2   3
             / \
            4   5
         */


        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);


        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;

        Assert.assertTrue(b.isBalanced(one));

    }
}