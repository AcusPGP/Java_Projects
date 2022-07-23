package Array;

import java.util.Scanner;

/**
 * Exercise 1: Ascending order
 * Exercise 2: Descending order
 * Exercise 3: Find and count the times of the most appearing number in the given array
 * Exercise 4: Find the largest number in the given array by the loop for and if
 * Exercise 5: Find the smallest number in the given array by the loop for and if
 */
public class Array_01 {
    public static String getInput(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.print(input);
        return sc.nextLine();
    }

    public static boolean exit(String input) {
        System.out.println(" ");
        return input.equalsIgnoreCase("thoat") || input.equalsIgnoreCase("exit");
    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            System.out.println(input + " is a correct value.");
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Error. " + "'" + input + "'" + " is not a correct input integer.");
            System.out.println("Please input a correct value.");
            return false;
        }
    }

    public static String array(String input) {
        /**
         * Input the array
         */
        int i, j;
        i = Integer.parseInt(input);
        System.out.println("The array length is " + i);
        System.out.println(" ");
        int[] array = new int[i];
        int[] check = new int[i];
        for (j = 0; j < i; j++) {
            System.out.print("Enter the box " + j + " a value: ");
            Scanner sc = new Scanner(System.in);
            String temp = sc.nextLine();
            if (temp.equalsIgnoreCase("thoat") || temp.equalsIgnoreCase("exit")) {
                return "exit";
            }
            array[j] = Integer.parseInt(temp.trim());
            check[j] = -1;
        }
        System.out.println(" ");
        /**
         * Ascending order
         */
        int t, a, b;
        for (a = 0; a < array.length; a++) {
            for (b = a + 1; b < array.length; b++) {
                if (array[b] < array[a]) {
                    t = array[b];
                    array[b] = array[a];
                    array[a] = t;
                }
            }
        }
        System.out.println(" ");
        System.out.print("The array list in ascending order is: ");
        for (j = 0; j < i; j++) {
            System.out.print(array[j] + " ");
        }
        /**
         * Descending order
         */
        for (a = 0; a < array.length; a++) {
            for (b = a + 1; b < array.length; b++) {
                if (array[b] > array[a]) {
                    t = array[b];
                    array[b] = array[a];
                    array[a] = t;
                }
            }
        }
        System.out.println(" ");
        System.out.print("The array list in descending order is ");
        for (j = 0; j < i; j++) {
            System.out.print(array[j] + " ");
        }
        /**
         * Find and count the times of the most appearing number in the given array
         *                  (0  1  2  3  4)
         * The array :       2  2  3  2  4
         *
         * The check :      -1 -1 -1 -1 -1 => count = 3
         * 1st try: a=0:     3  0  3  0  3 => count = 1
         * 2nd try: a=1:     3  0  1  0  1
         */
        for (a = 0; a < array.length; a++) {
            int count = 1;
            for (b = a + 1; b < array.length; b++) {
                if (array[b] == array[a] && check[b] != 0) {
                    count++;
                    check[b] = 0;
                }
            }
            if (check[a] != 0) {
                check[a] = count;
            }
        }
        t = check[0];
        for (j = 0; j < check.length; j++) {
            if (check[j] > t) {
                t = check[j];
            }
        }
        System.out.println(" ");
        System.out.print("The most appearances in the array is " + t);
        System.out.println(" ");
        System.out.print("The most appearing number in the array is ");
        for (j = 0; j < check.length; j++) {
            if (check[j] == t) {
                System.out.print(array[j] + ", ");
            }
        }
        System.out.println("\b\b");
        /**
         * Find the largest number in the given array
         * Find the smallest number in the given array
         */
        int min = array[0];
        int max = array[0];
        for (j = 0; j < i; j++) {
            if (array[j] < min) {
                min = array[j];
            }
            if (array[j] > max) {
                max = array[j];
            }
        }
        System.out.println("The smallest number in the array is: " + min);
        System.out.println("The largest number in the array is: " + max);
        return "array";
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println(" ");
            String input = getInput("Please input a length for the array: ");
            if (exit(input)) {
                System.out.println("Finished!");
                break;
            } else {
                if (isInteger(input)) {
                    String value = array(input);
                    if (value.equalsIgnoreCase("exit")) {
                        System.out.println(" ");
                        System.out.println("Finished!");
                        break;
                    }
                }
            }
        }
    }
}
