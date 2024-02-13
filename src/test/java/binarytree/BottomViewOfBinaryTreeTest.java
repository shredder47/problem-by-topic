package binarytree;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BottomViewOfBinaryTreeTest {
    /*

    Bottom view of following tree is 4 2 6 3 7 8 9
              1
            | | |
          / | | | \
         2  | | |  3
       /   \| | |/   \
      4     |5|6|     7
            | | |      \
            | | |       8
            | | |        \
                          9
 */

    @Test
    public void bottomView1() {

       Node node1 = new Node(1);
       Node node2 = new Node(2);
       Node node3 = new Node(3);
       Node node4 = new Node(4);
       Node node5 = new Node(5);
       Node node6 = new Node(6);
       Node node7 = new Node(7);
       Node node8 = new Node(8);
       Node node9 = new Node(9);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node7.right = node8;
        node8.right = node9;

        ArrayList<Integer> integers = BottomViewOfBinaryTree.bottomView(node1);
        Assert.assertArrayEquals(new int[]{4, 2, 6, 3, 7, 8, 9}, integers.stream().mapToInt(Integer::intValue).toArray());


    }

/*
       10
    /      \
  20        30
 /   \    /    \
40   60  90    100

Output:  40 20 90 30 100

*/

    @Test
    public void bottomView2() {

        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node40 = new Node(40);
        Node node60 = new Node(60);
        Node node90 = new Node(90);
        Node node100 = new Node(100);

        node10.left = node20;
        node10.right = node30;
        node20.left = node40;
        node20.right = node60;
        node30.left = node90;
        node30.right = node100;


        ArrayList<Integer> integers = BottomViewOfBinaryTree.bottomView(node10);
        System.out.println(integers);
        Assert.assertArrayEquals(new int[]{40, 20, 90, 30,100}, integers.stream().mapToInt(Integer::intValue).toArray());


    }
}