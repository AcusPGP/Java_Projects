package mathproblem;

import java.util.Scanner;

/**
 * Exercise 15: S(n) = Sqr(2+Sqr(2+...Sqr(2+Sqr(2))))
 */
public class MathProblem_01 {
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
            float t = (float) Math.sqrt(2);
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
    static float sumSqr(int n, float t) {
        if (n == 1) {
            return t;
        }
        return sumSqr(n - 1, (float) Math.sqrt(2 + t));
    }
}
