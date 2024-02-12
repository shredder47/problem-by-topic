package binarytree;


//https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LeftViewOfBinaryTree {


    public static ArrayList<Integer> leftView(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();

        List<List<Integer>> levelItems = travelLeft(root);

        for (List<Integer> levelItem : levelItems) {
            result.add(levelItem.get(0));
        }

        return result;
    }

    private static List<List<Integer>> travelLeft(TreeNode node) {

        List<List<Integer>> levels = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(node);
        queue.add(null);

        List<Integer> currentLevelItems = new ArrayList<>();
        while (!queue.isEmpty()) {

            TreeNode poll = queue.poll();

            if (poll == null) {

                if (queue.isEmpty()) {
                    //important to add the last item to the level
                    levels.add(currentLevelItems);
                    return levels;
                }
                //once we hit null, i.e. end of level, add all the collected data to levels list
                levels.add(currentLevelItems);

                //set the flag for new level
                queue.add(null);

                //so that new data for new level can be freshly added
                currentLevelItems = new ArrayList<>();

                continue;
            }
            //populate the current level's array with data
            currentLevelItems.add(poll.val);

            if (poll.left != null)
                queue.add(poll.left);
            if (poll.right != null)
                queue.add(poll.right);


        }
        return levels;
    }

    /*

Left view of following tree is 1 2 4 8 9.

          1
       /     \
     2        3
   /     \    /    \
  4       5   6    7
   \
     8
      \
       9
 */
    public static void main(String[] args) {
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
        node4.right = node8;
        node8.right = node9;

        System.out.println(leftView(node1));

    }
}

