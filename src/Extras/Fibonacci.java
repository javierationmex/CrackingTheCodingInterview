package Extras;

import java.util.Scanner;

/**
 * Created by Javier G on 10/9/2015.
 */
public class Fibonacci {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("What fibonacci number would you like to find?");
        int number = keyboard.nextInt();

        System.out.println("Recursive solution");
        System.out.println("Fibonacci number for " + number + " is: " +
                fibonacciRecursive(number));
        System.out.println();
        System.out.println("Dynamic Programming solution");
        System.out.println("Fibonacci number for " + number + " is: " +
                fibonacciDP(number));


    }

    public static int fibonacciRecursive(int i){
        if (i == 0){
            return 0;
        } else if (i == 1){
            return 1;
        } else {
            return fibonacciRecursive(i -1) +
                    fibonacciRecursive(i - 2);
        }

    }

    public static int fibonacciDP(int i){
        int[] memo = new int[i+1];
        return fibonacciDynamicProgramming(i, memo);
    }

    private static int fibonacciDynamicProgramming(int i, int[] memo) {
        if (i == 0 || i == 1){
            return i;
        }

        if (memo[i] == 0){
            memo[i] = fibonacciDynamicProgramming(i -1, memo) +
                    fibonacciDynamicProgramming(i - 2, memo);
        }
        return memo[i];
    }

}
