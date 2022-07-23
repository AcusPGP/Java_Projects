package MathProblem;

import java.util.Scanner;

import static java.lang.Math.max;

/**
 * Exercise 9: Minus for 2 big integers.
 */
public class MinusBigInteger {

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
        String minus = minus(s1, s2);
        System.out.println("The sum for 2 integers is " + minus);
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
     * Calculate the minus between two string
     *
     * @param s1
     * @param s2
     * @return
     */
    static String minus(String s1, String s2) {
        String s = "";
        if (s1.compareTo(s2) >= 0) {
            int t = 0;
            s1 = reverse(s1);
            s2 = reverse(s2);
            int max = max(s1.length(), s2.length());
            for (int i = max; i > s2.length(); i--) {
                s2 += "0";
            }
            for (int i = 0; i < max; i++) {
                int minus = 0;
                if ((s1.charAt(i) - '0') < (s2.charAt(i) - '0')) {
                    minus = (s1.charAt(i) - '0') - (s2.charAt(i) - '0') + 10 - t;
                    t = 1;
                } else {
                    minus = (s1.charAt(i) - '0') - (s2.charAt(i) - '0') - t;
                    t = 0;
                }
                s += minus;
            }
        } else {
            s = minus(s2, s1);
            s = reverse(s);
            s += "-";
        }
        s = reverse(s);
        return s;
    }

    public static void main(String[] args) {
        while (true) {
            getInput();
        }
    }
}
