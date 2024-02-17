package binarytree;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaxDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return h(root);
    }

    public int h(TreeNode node){

        if(node == null)
            return 0;

        return Math.max(1 + h(node.left) , 1 + h(node.right));
    }


}
