package RecursiveMethod;

import java.util.Scanner;

/**
 * Exercise 12: Find the estimation of an integer by recursive method
 * Exercise 13: Calculate the odd estimation of the integer
 * Exercise 14: Calculate the even estimation of the integer
 */
public class IntegerEstimation {
    /**
     * Get input
     *
     * @param input
     * @return
     */
    public static String getInput(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.print(input);
        return sc.nextLine();
    }

    /**
     * Check and find the estimation of the intger
     *
     * @param n
     * @param i
     * @return
     */
    static int checkInteger(int n, int i) {
        if (n == i) {
            System.out.print(n);
            return n;
        }
        if (n % i == 0) {
            System.out.print(i + ", ");
            return checkInteger(n, i + 1);
        }
        return checkInteger(n, i + 1);
    }

    /**
     * Calculate the odd estimation of the integer
     * @param n
     * @param i
     * @param sumOdd
     * @return
     */
    static int sumOddEstimation(int n, int i, int sumOdd) {
        if (n == i) {
            if (i % 2 != 0) {
                sumOdd += i;
            }
            return sumOdd;
        }
        if (n % i == 0 && i % 2 != 0) {
            sumOdd += i;
            return sumOddEstimation(n, i + 1, sumOdd);
        }
        return sumOddEstimation(n, i + 1, sumOdd);
    }

    /**
     * Calculate the even estimation of the integer
     * @param n
     * @param i
     * @param sumEven
     * @return
     */
    static int sumEvenEstimation(int n, int i, int sumEven) {
        if (n == i) {
            if (i % 2 == 0) {
                sumEven += i;
            }
            return sumEven;
        }
        if (n % i == 0 && i % 2 == 0) {
            sumEven += i;
            return sumEvenEstimation(n, i + 1, sumEven);
        }
        return sumEvenEstimation(n, i + 1, sumEven);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println(" ");
            int n = Integer.parseInt(getInput("Please input a number: "));
            System.out.print("The estimation of the number " + n + " is ");
            int i = 1;
            int t = checkInteger(n, i);
            int sumOdd = 0;
            int sumEven = 0;
            sumOdd = sumOddEstimation(n, i, sumOdd);
            sumEven = sumEvenEstimation(n, i, sumEven);
            System.out.println(" ");
            System.out.println("The sum for odd estimaton of the number is " + sumOdd);
            System.out.println("The sum for even estimaton of the number is " + sumEven);
        }
    }
}
