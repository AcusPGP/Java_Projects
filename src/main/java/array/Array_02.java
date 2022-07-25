package array;

import java.util.Scanner;

/**
 * Exercise 4 và 5
 * Find the largest number and smallest number
 * in the given array by recursive method
 */
public class Array_02 {

    /**
     * Input the array length
     */
    public static String arrayLength(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.print(input);
        return sc.nextLine();
    }

    /**
     * Max number
     */
    public static int max(int[] array, int n) {
        if (n == 0) {
            return array[0];
        }
        int temp = max(array, n - 1);
        if (array[n - 1] > temp)
            return array[n - 1];
        return temp;
    }

    /**
     * Min number
     */
    public static int min(int[] array, int n) {
        if (n == 0) {
            return array[0];
        }
        int temp = min(array, n - 1);
        if (array[n - 1] < temp)
            return array[n - 1];
        return temp;
    }

    public static void main(String[] args) {
        while (true) {
            /**
             * Input the array
             */
            String input = arrayLength("Please input a length for the array: ");
            int length = Integer.parseInt(input);
            System.out.println("The array length is " + length);
            System.out.println(" ");
            int i;
            int[] array = new int[length];
            for (i = 0; i < length; i++) {
                System.out.print("Please input a value for box " + i + ": ");
                Scanner sc = new Scanner(System.in);
                String a = sc.nextLine();
                array[i] = Integer.parseInt(a.trim());
            }
            System.out.println(" ");
            /**
             Find the largest number and smallest number
             * in the given array by recursive method
             */
            int max = max(array, length);
            int min = min(array, length);
            System.out.println("The smallest number in the array is " + min);
            System.out.println("The largest number in the array is " + max);
            System.out.println(" ");
        }
    }
}
