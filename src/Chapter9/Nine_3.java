package Chapter9;

/**
 * Created by Javier G on 10/15/2015.
 */
public class Nine_3 {

    public static void main(String[] args) {
        //int[] array = {-20, -2, 2, 15, 18, 20, 21};
        int[] array = {-20, -2, 2, 15, 18, 20, 21};
        System.out.println(magicIndex(array));
    }

    public static int magicIndex(int[] array){
        int start = 0;
        int end = array.length - 1;
        int solution = helper(start, end, array);
        return solution;
    }

    private static int helper(int start, int end, int[] array) {

        int mid = (start + end) / 2;
        if (mid == array[mid]){
            return mid;
        }
        if (start == end){
            return -1;
        }
        if (array[mid] > mid){
            return helper(start, mid -1, array);
        } else {
            return helper(mid + 1, end, array);
        }
    }

}
