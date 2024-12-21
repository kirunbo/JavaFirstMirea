package ru.mirea.task30.no30_2;

class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

public class BST {
    TreeNode root;

    BST() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    TreeNode insertRec(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void inorderPrint() {
        inorderRec(root);
        System.out.println();
    }

    void printTree() {
        printTreeRec(root, 0);
    }

    void printTreeRec(TreeNode node, int level) {
        if (node != null) {
            printTreeRec(node.right, level + 1);
            System.out.print(" ".repeat(level * 4)); // Отступ для визуализации
            System.out.println(node.key);
            printTreeRec(node.left, level + 1);
        }
    }

    void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    TreeNode deleteRec(TreeNode root, int key) {
        if (root == null) return root;

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            root.key = minValue(root.right);

            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    int minValue(TreeNode root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
}

class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        int[] keys = {50, 30, 20, 40, 70, 60, 80, 10, 90, 5};
        for (int key : keys) {
            bst.insert(key);
        }

        bst.printTree();
        bst.inorderPrint();

        bst.deleteKey(20);

        bst.printTree();
        bst.inorderPrint();
    }
}
