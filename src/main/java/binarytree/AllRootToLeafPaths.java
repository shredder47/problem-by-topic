package binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/binary-tree-paths/description/

public class AllRootToLeafPaths {

    public List<String> binaryTreePaths(TreeNode root) {

        if (root == null)
            return Collections.emptyList();
        if (root.left == null && root.right == null)
            return Collections.singletonList(String.valueOf(root.val));

        List<String> result = new ArrayList<>();

        dfs(root, result, "");

        return result;
    }

    public void dfs(TreeNode node, List<String> res, String path) {


        if (node.left == null && node.right == null) {
            res.add(path + node.val);
            return;
        }

        path = path + node.val;

        if (node.left != null) {
            dfs(node.left, res, path + "->");
        }

        if (node.right != null) {
            dfs(node.right, res, path + "->");
        }

    }
}