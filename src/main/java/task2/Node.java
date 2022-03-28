package task2;

public class Node {

    // also called "value" in a binary tree
    // also called "key" in a binary search tree
    int data;

    Node left;
    Node right;

    int height; // used in AVL tree

    /**
     * Constructs a new node with the given data.
     *
     * @param data the data to store in the node
     */
    public Node(int data) {
        this.data = data;
    }

    public Node() {}

    public int getData() {
        return data;
    }
}
