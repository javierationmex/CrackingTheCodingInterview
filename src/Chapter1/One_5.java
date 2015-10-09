package Chapter1;

import java.util.Scanner;

/**
 * Created by Javier G on 10/9/2015.
 */
public class One_5 {

    public static void main(String[] args) {
        boolean result;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String word1 = keyboard.next();
        System.out.print("Enter the second word: ");
        String word2 = keyboard.next();

        System.out.println("Are " + word1 + " and " + word2 + " one edit away from being the same word?");
        result = oneEditAway(word1, word2);
        System.out.println(result);

    }

    public static boolean oneEditAway(String w1, String w2){

        //If lengths are the same, check if replacing one letter
        // would give the same word
        if(w1.length() == w2.length()){
            return replace(w1, w2);
        } else {
            //If words are different lengths, check if removal of one
            // letter would give the same word
            StringBuilder word1 = new StringBuilder(w1);
            StringBuilder word2 = new StringBuilder(w2);

            if (word1.length() > word2.length()){
                return remove(word1, word2);
            } else {
                return remove(word2, word1);
            }
        }
    }

    //Method to check if removal of 1 letter gives the same words
    private static boolean remove(StringBuilder big, StringBuilder small) {
        for(int i=0 ; i<big.length() ; i++){
            StringBuilder saveBig = new StringBuilder(big);
            big.deleteCharAt(i);
            if (big.toString().equals(small.toString())){
                return true;
            }
            big = saveBig;
        }
        return false;
    }

    //Method to check if replacing of 1 letter gives the same words
    private static boolean replace(String w1, String w2) {
        boolean flag = false;
        for (int i=0 ; i < w1.length() ; i++){
            if (w1.charAt(i) != w2.charAt(i)){
                if (flag){
                    return false;
                } else {
                    flag = true;
                }
            }
        }
        return flag;
    }

}
