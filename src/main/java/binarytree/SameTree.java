package binarytree;

public class SameTree {
    //https://leetcode.com/problems/same-tree/description/

    public boolean isSameTree(TreeNode p, TreeNode q) {

        //If both are null, then they are same.
        if (p == null && q == null)
            return true;
        //If one is null and other is not, then they are not same.
        if(p == null && q != null)
            return false;
        //If one is null and other is not, then they are not same.
        if(p != null && q == null)
            return false;

        //If both are not null, then if their values are not same, then they are not same.
        if(p.val != q.val)
            return false;

        //If both are not null and their values are same, then check for their left and right subtrees.
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        SameTree st = new SameTree();
        System.out.println(st.isSameTree(p, q));
    }
/*

        2              2
       /          /     \
      1                  1



 */
}
