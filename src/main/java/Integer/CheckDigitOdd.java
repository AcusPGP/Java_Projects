package Integer;

import java.util.Scanner;

/**
 * Exercise 19: Check if the digits of the number are total odd or not
 */
public class CheckDigitOdd {

    /**
     * Get input - output
     */
    static void getInput() {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Input an integer.");
        System.out.print("Number: ");
        s = sc.nextLine();
        if (checkOdd(s).equalsIgnoreCase("true")) {
            System.out.println("Result: True");
        } else {
            System.out.println("Result: False");
        }
    }

    /**
     * Check each digit in the integer if it is odd or not
     * @param s
     * @return
     */
    static String checkOdd(String s) {
        int i;
        for (i = 0; i < s.length(); i++) {
            char check = s.charAt(i);
            int t = Integer.parseInt(String.valueOf(check));
            if (t % 2 != 0) {
                continue;
            } else {
                return "false";
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        while (true) {
            getInput();
        }
    }
}
