package Integer;

import java.util.Scanner;

/**
 * Exercise 20: Find the greatest divisor of two numbers.
 */
public class GreatestDivisor {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1: ");
        num1 = (int) scanner.nextInt();
        System.out.print("Number 2: ");
        num2 = (int) scanner.nextInt();
        scanner.close();
        while (num1 != num2) {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        System.out.print("The greatest divisor is " + num2);
    }
}
