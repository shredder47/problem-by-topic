package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/find-bottom-left-tree-value/description

//Input: root = [2,1,3]
//Output: 1
public class BottomLeftTreeValue {

    public int findBottomLeftValue(TreeNode root) {

        if (root == null)
            return 0;

        List<List<Integer>> levelElements = bfs(root);

        return levelElements.get(levelElements.size() -1).get(0);
    }

    private List<List<Integer>> bfs(TreeNode root) {

        List<List<Integer>> levelElements = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        queue.add(null);

        List<Integer> currentLevelElements = new ArrayList<>();

        while (!queue.isEmpty()) {

            TreeNode poll = queue.poll();


            if (poll == null) {

                if (queue.isEmpty()) {

                    levelElements.add(currentLevelElements);
                    return levelElements;
                }
                levelElements.add(currentLevelElements);
                currentLevelElements = new ArrayList<>();
                queue.add(null);

            } else {

                currentLevelElements.add(poll.val);

                if (poll.left != null)
                    queue.add(poll.left);

                if (poll.right != null)
                    queue.add(poll.right);

            }

        }

        return levelElements;
    }


}
