package Extras;

import java.util.ArrayList;

/**
 * Created by Javier G on 10/9/2015.
 */
public class GetLongestPath {

    public static void main(String[] args) {
        Node six = new Node(6, null, null);
        Node five = new Node(5, six, null);
        Node nine = new Node(9, null, null);
        Node two = new Node(2, nine, five);
        Node eight = new Node(8, null, null);
        Node four = new Node(4, eight, null);
        Node root = new Node(3, two, four);

        ArrayList<Integer> longestPath =
                gLP(root);

        System.out.println("Longest path from" + root.value + " is: ");
        for (int i=0 ; i < longestPath.size() ; i++){
            System.out.println(longestPath.get(i));
        }
    }

    public static ArrayList<Integer> gLP(Node root){
        if (root == null){
            return new ArrayList<Integer>();
        }

        ArrayList<Integer> left = gLP(root.left);
        ArrayList<Integer> right = gLP(root.right);

        if (left.size() >= right.size()){
            left.add(0, root.value);
            return left;
        } else {
            right.add(0, root.value);
            return right;
        }


    }

}
