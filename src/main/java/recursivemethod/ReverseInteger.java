package recursivemethod;

import java.util.Scanner;

/**
 * Exercise 18: Reverse an integer
 */
public class ReverseInteger {
    /**
     * Get input as a string - output the result as an integer
     */
    static void getInput() {
        while (true) {
            String s, s1;
            int s2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Input an integer.");
            System.out.print("Number: ");
            s = sc.nextLine();
            s1 = reverse(s);
            s2 = Integer.parseInt(s1);
            System.out.println("The reverse output of the nunber: " + s2);
        }
    }


    /**
     * Reverse the string
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

    public static void main(String[] args) {
        getInput();
    }
}

