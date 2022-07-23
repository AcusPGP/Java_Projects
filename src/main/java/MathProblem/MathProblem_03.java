package MathProblem;

import java.util.Scanner;

/**
 * Exercise 17: S(n) = Sqr(1+Sqr(2+Sqr(3+...Sqr(n-1+Sqr(n)))))
 */
public class MathProblem_03 {
    public static void main(String[] args) {
        getInput();
    }

    /**
     * get Input
     */
    static void getInput() {
        while (true) {
            String s;
            Scanner sc = new Scanner(System.in);
            System.out.println("Input an integer.");
            System.out.print("Number: ");
            s = sc.nextLine();
            int n = Integer.parseInt(s);
            float t = (float) Math.sqrt(n);
            float sum = sumSqr(n, t);
            System.out.println("The result is " + sum);
        }
    }

    /**
     * Calculate the math problem
     * @param n
     * @param t
     * @return
     */
    static float sumSqr (int n, float t) {
        if (n == 1) {
            return t;
        }
        return sumSqr(n - 1, (float) Math.sqrt(n - 1 + t));
    }
}
