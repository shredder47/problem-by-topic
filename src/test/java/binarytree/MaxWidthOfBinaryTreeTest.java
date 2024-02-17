package binarytree;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxWidthOfBinaryTreeTest {

    MaxWidthOfBinaryTree m = new MaxWidthOfBinaryTree();

    @Test
    public void widthOfBinaryTree() {

        /*

                1
               / \
              2   3
             / \   \
            4   5   6
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
        three.right = six;


        System.out.println(m.widthOfBinaryTree(one));


    }

    @Test
    public void widthOfBinaryTree2() {

        /*

                1
               / \
              2   5
             /     \
            3       6
           /       /
          4       7



         */


        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        one.left = two;
        two.left = three;
        three.left = four;
        one.right = five;
        five.right = six;
        six.left = seven;


        System.out.println(m.widthOfBinaryTree(one));


    }
}