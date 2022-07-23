package MathProblem;

import java.util.Scanner;

import static java.lang.Math.max;

/**
 * Exercise 8: Sum for 2 big integers.
 */
public class SumBigInteger {

    /**
     * Get Input
     */
    static void getInput() {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 2 integers.");
        System.out.print("Number 1: ");
        s1 = sc.next();
        System.out.print("Number 2: ");
        s2 = sc.next();
        String sum = sum(s1, s2);
        System.out.println("The sum for 2 integers is " + sum);
    }

    /**
     * Reverse the string
     *
     * @param s
     * @return
     */
    static String reverse(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            //The charAt() method returns the character at a specified index (position) in a string.
            s1 += s.charAt(s.length() - 1 - i);
        }
        return s1;
    }

    /**
     * Calculate the sum between two strings
     *
     * @param s1
     * @param s2
     * @return
     */
    static String sum(String s1, String s2) {
        String s = "";
        int i1 = s1.length();
        int i2 = s2.length();
        //The max() method returns the maximum of the two arguments. For example: x1 = 3; x2 = 4 => max (x1,x2) = 4
        int max = max(i1, i2);
        s1 = reverse(s1);
        s2 = reverse(s2);
        if (max > i1) {
            for (int i = max; i >= i1; i--) {
                s1 += "0";
            }
        }
        if (max > i2) {
            for (int i = max; i >= i2; i--) {
                s2 += "0";
            }
        }
        int t = 0;
        for (int i = 0; i < max; i++) {
            int sum = 0;
            sum = (s1.charAt(i) - '0') + (s2.charAt(i) - '0') + t;
            s += sum % 10;
            t = sum / 10;
        }
        if (t == 1) {
            s += 1;
        }
        s = reverse(s);
        return s;
    }

    public static void main(String[] args) {
        getInput();
    }
}
