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
        TreeNodeGeneric<Integer> node1 = new TreeNodeGeneric<>(1);
        TreeNodeGeneric<Integer> node2 = new TreeNodeGeneric<>(2);
        TreeNodeGeneric<Integer> node3 = new TreeNodeGeneric<>(3);
        TreeNodeGeneric<Integer> node4 = new TreeNodeGeneric<>(4);
        TreeNodeGeneric<Integer> node5 = new TreeNodeGeneric<>(5);
        TreeNodeGeneric<Integer> node6 = new TreeNodeGeneric<>(6);
        TreeNodeGeneric<Integer> node7 = new TreeNodeGeneric<>(7);
        TreeNodeGeneric<Integer> node8 = new TreeNodeGeneric<>(8);
        TreeNodeGeneric<Integer> node9 = new TreeNodeGeneric<>(9);

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