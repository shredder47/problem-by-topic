package binarytree;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiameterOfTreeTest {

    DiameterOfTree d = new DiameterOfTree();

    @Test
    public void diameterOfBinaryTree() {
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

        System.out.println(d.getDiameter(one));



    }
}