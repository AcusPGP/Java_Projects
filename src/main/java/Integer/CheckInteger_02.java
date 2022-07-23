package Integer;

import java.util.Scanner;

/**
 * Exercise 21: Check if the integer is 2^k.
 */
public class CheckInteger_02 {
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
            int check = Integer.parseInt(s);
            if (checkInt(check)) {
                System.out.println("Result: TRUE");
            } else {
                System.out.println("Result: FALSE");
            }
        }
    }

    /**
     * Check the integer
     * @param check
     * @return
     */
    static boolean checkInt(int check) {
        if (check == 1) {
            return true;
        }
        if (check > 1 && check % 2 == 0) {
            return checkInt(check / 2);
        } else {
            return false;
        }
    }
}
