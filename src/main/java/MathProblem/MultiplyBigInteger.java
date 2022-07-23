package MathProblem;

import java.util.Scanner;

/**
 * Exercise 10: Multiply two big integers.
 */
public class MultiplyBigInteger {
    /**
     * Get input
     */
    static void getInput() {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 2 integers.");
        System.out.print("Number 1: ");
        s1 = sc.next();
        System.out.print("Number 2: ");
        s2 = sc.next();
        String multiply = multiply(s1, s2);
        System.out.println("The multiply for 2 integers is " + multiply);
    }

    /**
     * Multiply two integers.
     * @param s1
     * @param s2
     * @return
     */
    static String multiply(String s1, String s2) {
        String s = "";
        int[] array = new int[s1.length() + s2.length()];
        for (int i = s1.length() - 1; i >= 0; i--) {
            for (int j = s2.length() - 1; j >= 0; j--) {
                array[i + j + 1] += (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
            }
        }
        for (int i = s1.length() + s2.length() - 1; i > 0; i--) {
            if (array[i] > 9) {
                array[i - 1] += array[i] / 10;
                array[i] %= 10;
            }
        }
        for (int i = 0; i < s1.length() + s2.length(); i++) {
            s += array[i];
        }
        return s;
    }

    public static void main(String[] args) {
        getInput();
    }
}
