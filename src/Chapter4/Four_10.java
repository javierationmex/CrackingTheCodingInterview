package Chapter4;

import Extras.Node;

/**
 * Created by Javier G on 10/15/2015.
 */
public class Four_10 {
    private static Node t1 = null;
    private static Node t2 = null;
    private static Node z = null;
    private static Node w = null;
    private static Node y = null;
    private static Node a = null;
    private static Node b = null;
    private static Node c = null;
    private static Node d = null;
    private static Node e = null;
    private static Node f = null;
    private static Node g = null;
    private static Node l = null;
    private static Node m = null;
    private static Node n = null;

    public static void main(String[] args) {
        createTrees();

        System.out.println("Is T2 a subtree of T1? " + isSubTree(t1, t2));

    }

    private static void createTrees() {

        d = new Node(7, null, null);
        e = new Node(8, null, null);
        f = new Node(9, null, null);
        g = new Node(10, null, null);
        l = new Node(98, null, null);
        m = new Node (99, null, null);
        n = new Node(100, null, null);
        b = new Node(5, d, e);
        c = new Node(6, f, g);
        t2 = new Node(4, b, c);
        y = new Node(3, n, t2);

        w = new Node(2, l, m);
        t1 = new Node(1, w, y);

    }

    public static boolean isSubTree(Node T1, Node T2){
        if (T1 == T2){
            return checkEquality(T1, T2);
        }else if (T1 != null){
            return false;
        }
        isSubTree(T1.left, T2);
        isSubTree(T1.right, T2);

        //TODO this statement is causing it to return false at the end of it all
        // even though it should be true
        return false;
    }

    private static boolean checkEquality(Node t1, Node t2) {
        if (t1 == null && t2 == null){
            return true;
        }
        if (t1 == t2){
            if (checkEquality(t1.left, t2.left) &&
                    checkEquality(t1.right, t2.right)){
                return true;
            }
        }
        return false;
    }

}
