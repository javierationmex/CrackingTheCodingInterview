package Chapter4;

import Extras.Node;
import Extras.NodeWithParent;

/**
 * Created by Javier G on 10/9/2015.
 */
public  class Four_8 {
    private static NodeWithParent root = null;
    private static NodeWithParent two = null;
    private static NodeWithParent three = null;
    private static NodeWithParent four = null;
    private static NodeWithParent five = null;
    private static NodeWithParent six = null;
    private static NodeWithParent seven = null;
    private static NodeWithParent eight = null;
    private static NodeWithParent nine = null;
    private static NodeWithParent ten = null;
    private static NodeWithParent eleven = null;
    private static NodeWithParent twelve = null;
    private static NodeWithParent thirteen = null;
    private static NodeWithParent fourteen = null;

    public static void main(String[] args) {


        createTree();

        NodeWithParent result = getFirstCommonAncestorWithParents(root, four, eleven);
        System.out.println("First common ancestor of four and eleven is: " + result.value);

    }

    private static void createTree() {
        root = new NodeWithParent(1, two, three, null);
        two = new NodeWithParent(2, four, five, root);
        three = new NodeWithParent(3, six, seven, root);
        four = new NodeWithParent(4, eight, nine, two);
        five = new NodeWithParent(5, ten, eleven, two);
        six = new NodeWithParent(6, twelve, null, three);
        seven = new NodeWithParent(7, thirteen, fourteen, three);
        eight = new NodeWithParent(8, null, null, four);
        nine = new NodeWithParent(9, null, null, four);
        ten = new NodeWithParent(10, null, null, five);
        eleven = new NodeWithParent(11, null, null, five);
        twelve = new NodeWithParent(12, null, null, six);
        thirteen = new NodeWithParent(13, null, null, seven);
        fourteen = new NodeWithParent(14, null, null, seven);

    }

    public static NodeWithParent getFirstCommonAncestorWithParents (NodeWithParent root, NodeWithParent i, NodeWithParent j){
        NodeWithParent tI = i;
        NodeWithParent tJ = j;

        int heightI = 0;
        int heightJ = 0;

        while (tI != root){
            tI = tI.parent;
            heightI++;
        }

        while (tJ != root){
            tJ = tJ.parent;
            heightJ++;
        }

        int diff = Math.abs(heightJ - heightI);
        while (diff > 0){
            if (heightJ > heightI) {
                j = j.parent;
                diff--;
            } else {
                i = i.parent;
                diff--;
            }
        }

        while (i != j){
            i = i.parent;
            j = j.parent;
        }

        return i;

    }

}
