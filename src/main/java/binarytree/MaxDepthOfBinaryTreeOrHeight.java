package binarytree;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaxDepthOfBinaryTreeOrHeight {

    public int maxDepth(TreeNode root) {
        return h(root);
    }

    public int h(TreeNode node){

        if(node == null)
            return 0;

        int left = h(node.left);
        int right = h(node.right);

        return 1 + Math.max(left,right);
    }


}
