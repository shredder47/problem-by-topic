package binarytree;

import org.junit.Assert;
import org.junit.Test;

public class LeftViewOfBinaryTreeTest {

    LeftViewOfBinaryTree l = new LeftViewOfBinaryTree();
    @Test
    public void getLeftView() {
/*

    Left view of following tree is 1 2 4 8 9.

              1
           /     \
         2        3
       /     \    /   \
      4       5   6    7
                        \
                         8
                          \
                           9
 */
        TreeNode<Integer> node1 = new TreeNode<>(1);
        TreeNode<Integer> node2 = new TreeNode<>(2);
        TreeNode<Integer> node3 = new TreeNode<>(3);
        TreeNode<Integer> node4 = new TreeNode<>(4);
        TreeNode<Integer> node5 = new TreeNode<>(5);
        TreeNode<Integer> node6 = new TreeNode<>(6);
        TreeNode<Integer> node7 = new TreeNode<>(7);
        TreeNode<Integer> node8 = new TreeNode<>(8);
        TreeNode<Integer> node9 = new TreeNode<>(9);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node7.right = node8;
        node8.right = node9;

        int[] output = l.getLeftView(node1).stream().mapToInt(Integer::intValue).toArray();
        Assert.assertArrayEquals(new int[]{1,2,4,8,9},output);
    }
}