package RecursiveMethod;

import java.util.Scanner;

/**
 * Exercise 6: S(n) = 1 + 2 + 3 … + n by recursive method.
 * Exercise 7: S(n) = 1^2 + 2^2 + 3^2 + … + n^2 by recursive method.
 */

public class RecursiveSum {
    public static String getInput(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.print(input);
        return sc.nextLine();
    }

    /**
     * Exercise 6: S(n) = 1 + 2 + 3 … + n
     * @param n
     * @return
     */
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }

    /**
     * Exercise 7: S(n) = 1^2 + 2^2 + 3^2 + … + n^2
     * @param n
     * @return
     */
    public static int sumSquare(int n) {
        if (n == 1) {
            return 1;
        }
        return n*n + sumSquare(n-1);
    }

    public static void main(String[] args) {
        while (true) {
            int n = Integer.parseInt(getInput("Please input a number: "));
            System.out.println(" ");
            int sum = sum(n);
            System.out.println("The Sum is " + sum);
            int sumSquare = sumSquare(n);
            System.out.println("The Square Sum is " + sumSquare);
            System.out.println(" ");
        }
    }
}
