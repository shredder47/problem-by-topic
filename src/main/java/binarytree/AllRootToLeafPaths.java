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

        List<List<String>> paths = new ArrayList<>();
        List<String> visited = new ArrayList<>();
        List<String> result = new ArrayList<>();

        dfs(root, visited, paths);

        for (List<String> path : paths) {
            String join = String.join("->", path);
            result.add(join);
        }
        return result;
    }

    public void dfs(TreeNode node, List<String> vis, List<List<String>> paths) {

        vis.add(String.valueOf(node.val));

        if (node.left == null && node.right == null) {
            paths.add(new ArrayList<>(vis));
            return;
        }

        if (node.left != null) {
            dfs(node.left, vis, paths);
            vis.remove(vis.size() - 1);

        }
        if (node.right != null) {
            dfs(node.right, vis, paths);
            vis.remove(vis.size() - 1);

        }
    }
}