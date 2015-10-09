package Extras;

import java.util.ArrayList;

/**
 * Created by Javier G on 10/1/2015.
 */
public class LeftSumEqualRightSum {

    public static void main(String[] args) {
        int[] nums = {
                -1, 3, -4,
                5, 1, -6,
                2, 1
        };
        ArrayList<Integer> solution = LookForPoints(nums);
        int i = 0;
        System.out.print("Solutions: ");
        while(i < solution.size()){
            System.out.print(solution.get(i) + " ");
            i++;
        }
    }

    public static ArrayList<Integer> LookForPoints(int[] nums){

        int lS = 0;
        int pointer = 0;
        int rS = SumArray(nums) - nums[0];
        ArrayList<Integer> solutions = new ArrayList<Integer>();

        while( pointer < nums.length){
            if (lS == rS){
                solutions.add(pointer);
            }
            lS += nums[pointer];
            pointer++;
            if (pointer == nums.length){
                break;
            }
            rS -= nums[pointer];


        }

        if (solutions.size() == 0){
            solutions.add(-1);
        }
        return solutions;



    }

    private static int SumArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

}
