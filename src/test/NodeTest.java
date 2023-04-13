package test;

import main.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void Should_ReturnOneLeave() {
        Node node = new Node(1, null, null);

        int leaves = Node.countLeaves(node);

        assertEquals(1, leaves);
    }

    @Test
    void Should_ReturnThreeLeaves() {
        Node node1 = new Node(1, null, null);
        Node node2 = new Node(10, null, null);
        Node node3 = new Node(4, node2, node1);
        Node node4 = new Node(7, null, null);

        Node root = new Node(2, node4, node3);
        int leaves = Node.countLeaves(root);

        assertEquals(3, leaves);
    }

    @Test
    void Should_GetMaxDepthEqualZero() {
        Node node = new Node(1, null, null);

        int depth = Node.getMaxDepth(node);

        assertEquals(0, depth);
    }

    @Test
    void Should_GetMaxDepthEqualFive() {
        Node node1 = new Node(13, null, null);
        Node node2 = new Node(5, node1, null);
        Node node3 = new Node(20, null, null);
        Node node4 = new Node(3, node3, node2);
        Node node5 = new Node(11, null, null);
        Node node6 = new Node(1, node4, node5);
        Node node7 = new Node(1, null, null);
        Node node8 = new Node(10, null, null);
        Node node9 = new Node(4, node8, node7);
        Node node10 = new Node(7, node6, null);
        Node root = new Node(2, node10, node9);

        int depth = Node.getMaxDepth(root);

        assertEquals(5, depth);
    }

    @Test
    void Should_GetNotEquivalentTrees() {
        Node root1 = new Node(1, null, null);
        Node root2 = new Node(0, null, null);

        boolean equivalent = Node.equivalentTrees(root1, root2);

        assertFalse(equivalent);
    }

    @Test
    void Should_GetNotEquivalentTreesV2() {
        Node node1 = new Node(13, null, null);
        Node node2 = new Node(5, node1, null);
        Node node3 = new Node(20, null, null);
        Node node4 = new Node(3, node3, node2);
        Node node5 = new Node(11, null, null);
        Node node6 = new Node(1, node4, node5);
        Node node7 = new Node(1, null, null);
        Node node8 = new Node(10, null, null);
        Node node9 = new Node(4, node8, node7);
        Node node10 = new Node(7, node6, null);
        Node root1 = new Node(2, node10, node9);


        Node node1v2 = new Node(14, null, null);
        Node node2v2 = new Node(5, node1v2, null);
        Node node3v2 = new Node(20, null, null);
        Node node4v2 = new Node(3, node3v2, node2v2);
        Node node5v2 = new Node(11, null, null);
        Node node6v2 = new Node(1, node4v2, node5v2);
        Node node7v2 = new Node(1, null, null);
        Node node8v2 = new Node(10, null, null);
        Node node9v2 = new Node(4, node8v2, node7v2);
        Node node10v2 = new Node(8, node6v2, null);
        Node root2 = new Node(2, node10v2, node9v2);

        boolean equivalent = Node.equivalentTrees(root1, root2);

        assertFalse(equivalent);
    }

    @Test
    void Should_GetEquivalentTrees() {
        Node root1 = new Node(0, null, null);
        Node root2 = new Node(0, null, null);

        boolean equivalent = Node.equivalentTrees(root1, root2);

        assertTrue(equivalent);
    }

    @Test
    void Should_GetEquivalentTreesV2() {
        Node node1 = new Node(13, null, null);
        Node node2 = new Node(5, node1, null);
        Node node3 = new Node(20, null, null);
        Node node4 = new Node(3, node3, node2);
        Node node5 = new Node(11, null, null);
        Node node6 = new Node(1, node4, node5);
        Node node7 = new Node(1, null, null);
        Node node8 = new Node(10, null, null);
        Node node9 = new Node(4, node8, node7);
        Node node10 = new Node(7, node6, null);
        Node root1 = new Node(2, node10, node9);


        Node node1v2 = new Node(13, null, null);
        Node node2v2 = new Node(5, node1v2, null);
        Node node3v2 = new Node(20, null, null);
        Node node4v2 = new Node(3, node3v2, node2v2);
        Node node5v2 = new Node(11, null, null);
        Node node6v2 = new Node(1, node4v2, node5v2);
        Node node7v2 = new Node(1, null, null);
        Node node8v2 = new Node(10, null, null);
        Node node9v2 = new Node(4, node8v2, node7v2);
        Node node10v2 = new Node(7, node6v2, null);
        Node root2 = new Node(2, node10v2, node9v2);

        boolean equivalent = Node.equivalentTrees(root1, root2);

        assertTrue(equivalent);
    }


}