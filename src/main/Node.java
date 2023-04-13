package main;

public class Node {
    private final int value;
    private final Node leftChild;
    private final Node rightChild;

    public Node(int value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public static int countLeaves(Node current) {
        if(current == null) {
            return 0;
        }

        if(current.getLeftChild() == null && current.getRightChild() == null) {
            return 1;
        } else {
            return countLeaves(current.getLeftChild()) + countLeaves(current.getRightChild());
        }
    }

    public static int maxDepth(Node current) {
        if (current == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(current.getLeftChild());
            int rightDepth = maxDepth(current.getRightChild());

            return Math.max(leftDepth + 1, rightDepth + 1);
        }
    }

    public static int getMaxDepth(Node root) {
        return maxDepth(root) - 1;
    }

    public static boolean equivalentTrees(Node root1, Node root2) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 != null && root2 != null) {
            return (root1.getValue() == root2.getValue()
                    && equivalentTrees(root1.getLeftChild(), root2.getLeftChild())
                    && equivalentTrees(root1.getRightChild(), root2.getRightChild()));
        }

        return false;
    }
}
