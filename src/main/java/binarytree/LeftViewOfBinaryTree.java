package binarytree;


//https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LeftViewOfBinaryTree {


    /*

Left view of following tree is 1 2 4 8 9.

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

    public ArrayList<Integer> getLeftView(TreeNode<Integer> root) {

        if (root == null)
            return new ArrayList<>();
        if (root.right == null && root.left == null)
            return new ArrayList<>(root.val);

        ArrayList<Integer> result = new ArrayList<>();

        computeLeftViews(root, result);

        return result;
    }

    private void computeLeftViews(TreeNode<Integer> node, ArrayList<Integer> result) {

        Queue<TreeNode<Integer>> queue = new LinkedList<>();

        queue.add(node);
        queue.add(null);

        List<Integer> currentLevelItems = new ArrayList<>();
        while (!queue.isEmpty()) {

            TreeNode<Integer> poll = queue.poll();

            if (poll == null) {

                if (queue.isEmpty()) {
                    //important to add the last item to the level
                    result.add(currentLevelItems.get(0));
                    return;
                }
                //once we hit null, i.e. end of level, add all the collected data to levels list
                result.add(currentLevelItems.get(0));

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
    }

}

