package binarytree;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllRootToLeafPathsTest {


    AllRootToLeafPaths a = new AllRootToLeafPaths();
    @Test
    public void binaryTreePaths() {

        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode five = new TreeNode(5);

        one.left = two;
        one.right = three;
        two.right = five;

        System.out.println(a.binaryTreePaths(one));
    }
}