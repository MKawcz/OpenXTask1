package main;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(5, null, null);
        Node node2 = new Node(8, null, node1);
        Node node3 = new Node(2, null, null);
        Node node4 = new Node(0, node3, node2);
        Node node5 = new Node(1, null, null);
        Node node6 = new Node(7, node5, node4);
        Node node7 = new Node(5, null, null);
        Node node8 = new Node(2, null, null);
        Node node9 = new Node(3, node8, node7);
        Node root1 = new Node(5, node9, node6);

        Node node1v2 = new Node(5, null, null);
        Node node2v2 = new Node(8, null, node1v2);
        Node node3v2 = new Node(2, null, null);
        Node node4v2 = new Node(0, node3v2, node2v2);
        Node node5v2 = new Node(1, null, null);
        Node node6v2 = new Node(7, node5v2, node4v2);
        Node node7v2 = new Node(5, null, null);
        Node node8v2 = new Node(2, null, null);
        Node node9v2 = new Node(3, node8v2, node7v2);
        Node root2 = new Node(5, node9v2, node6v2);

        System.out.println(Node.countLeaves(root1));
        System.out.println(Node.getMaxDepth(root1));
        System.out.println(Node.equivalentTrees(root1, root2));
    }
}