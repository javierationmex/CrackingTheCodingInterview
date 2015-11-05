package Chapter1;

/**
 * Created by Javier G on 11/5/2015.
 */
public class One_9 {

    public static void main(String[] args) {

        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        System.out.println("Is erbottlewat a rotation of waterbottle? " + isRotation(s1, s2));
    }



    public static boolean isRotation(String s1, String s2){

        if(s1.length() == s2.length()){
            String concat = s1 + s1;
            return isSubstring(s2, concat);
        }
        return false;
    }

    private static boolean isSubstring(String s1, String s2) {

        if (s2.indexOf(s1) != -1) {
            return true;
        }
        return false;

    }

}
