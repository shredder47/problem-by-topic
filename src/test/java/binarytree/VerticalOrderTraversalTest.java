package binarytree;

import org.junit.Test;

import java.util.List;

public class VerticalOrderTraversalTest{

    VerticalOrderTraversal v = new VerticalOrderTraversal();
    @Test
    public void verticalOrderTraversal() {
/*

     OUTPUT: [[4], [2], [1, 5, 6], [3], [7], [8], [9]]

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
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node7.right = node8;
        node8.right = node9;

        List<List<Integer>> lists = v.verticalTraversal(node1);
        System.out.println(lists);

    }
}