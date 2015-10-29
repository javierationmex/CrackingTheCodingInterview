package Extras;

import java.util.ArrayList;

/**
 * Created by Javier G on 10/16/2015.
 */
public class permutations {

    public static void main(String[] args) {
        //TODO, not finished at all
    }

    public static ArrayList<ArrayList<Character>> permute(ArrayList<ArrayList<Character>> list){
        if (list.isEmpty()){
            ArrayList<Character> baseCase = new ArrayList<Character>();
            baseCase.add(null);
            list.add(baseCase);
            return list;
        }

        Character last = list.get(0).get(list.size());
//        list.get(0).remove();

        return null;
    }

}
