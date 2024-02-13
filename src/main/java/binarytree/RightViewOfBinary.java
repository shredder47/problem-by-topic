package binarytree;


import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/problems/binary-tree-right-side-view/description/
public class RightViewOfBinary {
    public List<Integer> rightSideView(TreeNode root) {

        if (root == null)
            return Collections.emptyList();


        if (root.left == null && root.right == null)
            return Collections.singletonList(root.val);

        List<List<Integer>> levelWiseList = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null); // for marking the end of level

        List<Integer> currentLevelItems = new ArrayList<>();

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            //once we encounter null, that means all children are in queue,remove the null and put it at end of all children
            //to mark new level
            if (node == null) {

                //When its last level, and no children we encounter null
                if (queue.isEmpty()) {
                    levelWiseList.add(currentLevelItems);
                    break;
                }
                //As we reached the end of level, add all the items to the list and create a new one for next level
                levelWiseList.add(currentLevelItems);
                currentLevelItems = new ArrayList<>();
                queue.add(null); //
            } else {

                currentLevelItems.add(node.val);

                // add both the children to queue if present
                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }
        }

        return levelWiseList.stream().map(x -> x.get(x.size() - 1)).collect(Collectors.toList());

    }


}
