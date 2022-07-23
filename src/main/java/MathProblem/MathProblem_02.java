package MathProblem;

import java.util.Scanner;

/**
 *  Exercise 16: S(n) = Sqr(n+Sqr(n-1+Sqr(n-2+...Sqr(2+Sqr(1)))))
 */
public class MathProblem_02 {
    public static void main(String[] args) {
        getInput();
    }

    /**
     * Get input
     */
    static void getInput() {
        while (true) {
            String s;
            Scanner sc = new Scanner(System.in);
            System.out.println("Input an integer.");
            System.out.print("Number: ");
            s = sc.nextLine();
            int n = Integer.parseInt(s);
            float t = 1;
            int a = 1;
            float sum = sumSqr(n, a, t);
            System.out.println("The result is " + sum);
        }
    }

    /**
     * Calculate the math problem
     * @param n
     * @param a
     * @param t
     * @return
     */
    static float sumSqr(int n, int a, float t) {
        if (n == a) {
            return t;
        }
        return sumSqr(n, a + 1, (float) Math.sqrt(a + 1 + t));
    }
}
