package Extras;

/**
 * Created by Javier G on 10/9/2015.
 */
public class Node {
    public int value;
    public Node left, right;

    public Node() {
        this.left = null;
        this.right = null;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
