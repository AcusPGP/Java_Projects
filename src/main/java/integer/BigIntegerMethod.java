package integer;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Exercise 8,9,10,11: Calculate the sum, subtract, divide, multiply between two big integers
 */
public class BigIntegerMethod {
    public static void main(String[] args) {
        BigInteger s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 2 big integers: ");
        System.out.println("Number 1: ");
        s1 = new BigInteger(sc.next());
        System.out.println("Number 2: ");
        s2 = new BigInteger(sc.next());
        System.out.println("The sum is " + s1.add(s2));
        System.out.println("The subtract is " + s1.subtract(s2));
        System.out.println("The divide is " + s1.divide(s2));
        System.out.println("The multiply is " + s1.multiply(s2));
    }
}
