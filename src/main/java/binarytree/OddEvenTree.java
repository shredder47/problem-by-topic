package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class OddEvenTree {

    // https://leetcode.com/problems/even-odd-tree/


//    A binary tree is named Even-Odd if it meets the following conditions:
//
//    The root of the binary tree is at level index 0, its children are at level index 1, their children are at level index 2, etc.
//    For every even-indexed level, all nodes at the level have odd integer values in strictly increasing order (from left to right).
//    For every odd-indexed level, all nodes at the level have even integer values in strictly decreasing order (from left to right).
//    Given the root of a binary tree, return true if the binary tree is Even-Odd, otherwise return false.

//    Input: root = [1,10,4,3,null,7,9,12,8,6,null,null,2]
//    Output: true


    /*
                 5
               /   \
              4     2
             / \   /
            3   3 7


     */

    public boolean isEvenOddTree(TreeNode root) {
        return bfs(root);
    }

    private boolean bfs(TreeNode node) {

        Queue<TreeNode> queue = new LinkedList<>();
        Integer lastElement = null;

        int level = 0;

        queue.add(node);
        //for masking end of current level
        queue.add(null);

        while (!queue.isEmpty()) {

            TreeNode poll = queue.poll();

            // end of level encountered
            if (poll == null) {
                // All Nodes are traversed
                if (queue.isEmpty())
                    return true;
                // increase the level as null encountered
                level++;
                // for marking start of new level
                queue.add(null);
                // new level's last element is absent!
                lastElement = null;

            } else {

                int currentValue = poll.val;
                //if level is even
                if (level % 2 == 0) {
                    // level is EVEN but number is not odd OR elements are not in strictly increasing order,in those case we return false
                    if (currentValue % 2 == 0)
                        return false;
                    if (lastElement != null && lastElement >= currentValue)
                        return false;
                } else {
                    // level is ODD but number is not even OR elements are not in strictly decreasing order,in those case we return false
                    if (currentValue % 2 != 0)
                        return false;
                    if (lastElement != null && lastElement <= currentValue)
                        return false;
                }

                //setting last item as the current value so that we can compare for next item
                lastElement = currentValue;

                if (poll.left != null)
                    queue.add(poll.left);

                if (poll.right != null)
                    queue.add(poll.right);

            }

        }
        //if the traversal didn't returned false yet, return true
        return true;
    }


}
