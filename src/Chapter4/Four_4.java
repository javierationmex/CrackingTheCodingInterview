package Chapter4;

import Extras.Node;

/**
 * Created by Javier G on 10/29/2015.
 */
public class Four_4 {

    public static void main(String[] args) {
        //My tree
        Node k = new Node(1, null, null);
        Node i = new Node(2, k, null);
        Node j = new Node(3, null, null);
        Node h = new Node(4, i, j);
        Node g = new Node(5, null, null);
        Node f = new Node(6, g, h);
        Node d = new Node(7, f, null);
        Node e = new Node(8, null, null);
        Node c = new Node(9, d, e);
        Node b = new Node(10, null, null);
        Node a = new Node(11, b, c);


        //Andreas' tree
        Node root = new Node(5);
        Node l1 = new Node(4);
        Node r1 = new Node(3);
        Node ll2 = new Node(2);
        Node lr2 = new Node(1);
        Node rl2 = new Node(9);
        Node rr2 = new Node(8);
        Node lll3 = new Node(10);
        Node llr3 = new Node(12);
        Node rlr3 = new Node(6);
        Node rrr3 = new Node(4);

        root.left = l1;
        root.right = r1;
        l1.left =ll2;
        l1.right=lr2;

        ll2.left = lll3;

        ll2.right = llr3;

        r1.left = rl2;

        r1.right = rr2;/**
         rl2.right = rlr3;
         rr2.right = rrr3;*/


        System.out.println("My tree is balanced: " + isBalanced(a));
        System.out.println("My tree is balanced: " + isBalanced(root));
    }

    public static boolean isBalanced(Node root){
        if ((checkBalance(root)) != -1){
            return true;
        }

        return false;
    }

    public static int checkBalance(Node root){

        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }

        int heightL = 0;
        int heightR = 0;

        heightL += checkBalance(root.left);
        if (heightL == -1){
            return -1;
        }
        heightR += checkBalance(root.right);
        if (heightR == -1){
            return -1;
        }

        if (Math.abs(heightL - heightR) <= 1){
            return (Math.max(heightL, heightR) + 1);
        }

        return -1;
    }

}
