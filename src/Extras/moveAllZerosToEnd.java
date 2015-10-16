package Extras;

import java.util.ArrayList;

/**
 * Created by Javier G on 10/15/2015.
 */
public class moveAllZerosToEnd {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        int[] moved = moveZ(nums);
        int[] movedSmart = moveZerosEfficient(nums);
        System.out.println("Lame way: " + moved[0] + " " + moved[1] + " " + moved[2] + " " + moved[3] + " " + moved[4]);

        System.out.println("Smart way: " + movedSmart[0] + " " + movedSmart[1] + " " + movedSmart[2] + " " + movedSmart[3] + " " + movedSmart[4]);

    }

    public static int[] moveZ(int[] nums) {
        int zero = findZero(nums);
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0 && j > zero) {
                int tmp = nums[j];
                nums[zero] = tmp;
                nums[j] = 0;
                j = zero + 1;
                zero = findZero(nums);
            }
        }
        return nums;
    }

    private static int findZero(int[] nums) {
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }
        return zero;

    }

    private static int[] moveZerosEfficient(int[] nums) {
        ArrayList<Integer> values = findValues(nums);

        for (int i = 0; i < values.size(); i++) {
            nums[i] = values.get(i);
        }
        return nums;
    }


    private static ArrayList<Integer> findValues(int[] nums) {
        ArrayList<Integer> vals = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                vals.add(nums[i]);
            }
        }
        return vals;
    }

}

