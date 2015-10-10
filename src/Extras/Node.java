package Extras;

/**
 * Created by Javier G on 10/9/2015.
 */
public class Node {
    public int value;
    Node left, right;

    public Node() {
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
