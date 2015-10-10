package Extras;

/**
 * Created by Javier G on 10/9/2015.
 */
public class NodeWithParent extends Node{
    public NodeWithParent parent;

    public NodeWithParent(NodeWithParent parent) {
        this.parent = parent;
    }

    public NodeWithParent(int value, NodeWithParent left, NodeWithParent right, NodeWithParent parent) {
        super(value, left, right);
        this.parent = parent;
    }
}
