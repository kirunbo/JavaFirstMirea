package ru.mirea.task30.no30_1;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}


public class BinaryTree {
    Node root;

    public int calculateHeight(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(calculateHeight(node.left), calculateHeight(node.right));
    }

    public int calculateWidth() {
        int maxWidth = 0;
        int height = calculateHeight(root);

        for (int i = 0; i < height; i++) {
            int width = getWidth(root, i);
            maxWidth = Math.max(maxWidth, width);
        }
        return maxWidth;
    }

    private int getWidth(Node node, int level) {
        if (node == null) return 0;
        if (level == 0) return 1;
        return getWidth(node.left, level - 1) + getWidth(node.right, level - 1);
    }

    public boolean searchNode(Node node, int key) {
        if (node == null) return false;
        else{
            if (node.data == key) return true;
            else{
                if (key <= node.data) return searchNode(node.left, key);
                else return searchNode(node.right ,key);
            }
        }
    }

    public int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public boolean compareTrees(Node a, Node b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return (a.data == b.data) && compareTrees(a.left, b.left) && compareTrees(a.right, b.right);
    }

    public Node mirror(Node node) {
        if (node == null) return null;
        Node newRoot = new Node(node.data);
        newRoot.left = mirror(node.right);
        newRoot.right = mirror(node.left);
        return newRoot;
    }

    public void printInOrder(Node node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }
}

class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(3);
        tree.root.left = new Node(2);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(5);

        System.out.println("height of tree: " + tree.calculateHeight(tree.root));
        System.out.println("width of tree: " + tree.calculateWidth());
        System.out.println("node 4 found: " + tree.searchNode(tree.root, 4));
        System.out.println("node count: " + tree.countNodes(tree.root));

        BinaryTree tree2 = new BinaryTree();
        tree2.root = new Node(3);
        tree2.root.left = new Node(2);
        tree2.root.right = new Node(4);
        tree2.root.left.left = new Node(1);
        tree2.root.left.right = new Node(5);

        System.out.println("trees are equal: " + tree.compareTrees(tree.root, tree2.root));

        Node mirroredRoot = tree.mirror(tree.root);
        System.out.print("mirrored tree: ");
        tree.printInOrder(mirroredRoot);
    }
}
