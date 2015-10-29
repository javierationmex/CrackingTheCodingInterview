package Chapter8;

import java.util.Scanner;

/**
 * Created by Javier G on 10/15/2015.
 */
public class Eight_5 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        int y = keyboard.nextInt();

        System.out.println("Simple Multiplication of " + x + " x " + y + " is: " + simpleMultiplication(4, 10));

    }

    public static int simpleMultiplication(int x, int y) {
        int solution;
        if (y == 0) {
            return 0;
        } else if (y == 1) {
            return x;
        } else {
            solution = x + simpleMultiplication(x, y -1);
        }
        return solution;
    }

}
