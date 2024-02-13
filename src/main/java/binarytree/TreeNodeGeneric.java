package binarytree;

public class TreeNodeGeneric<T> {

    T val;
    TreeNodeGeneric<T> left;
    TreeNodeGeneric<T> right;

    TreeNodeGeneric() {
    }

    TreeNodeGeneric(T val) {
        this.val = val;
    }

    TreeNodeGeneric(T val, TreeNodeGeneric<T> left, TreeNodeGeneric<T> right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
