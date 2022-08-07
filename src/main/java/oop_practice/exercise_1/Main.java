package oop_practice.exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getInput();
    }

    public static void getInput() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String temp = "null";
        showMenu();
        String input = sc.nextLine().trim();
        while (true) {
            switch (Integer.parseInt(input)) {
                case 1:
                    OptionAdd newEmployee = new OptionAdd();
                    newEmployee.add();
                    temp = "menu";
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("\n" + "Invalid input! Please try again.");
            }
            if (exit) {
                System.out.println("Exit the program");
                break;
            }
            if(temp.equals("menu")) {
                getInput();
            }
        }
    }

    static void showMenu() {
        System.out.println("The menu: " + "\n");
        System.out.println("1. Add");
        System.out.println("2. Edit");
        System.out.println("3. Delete");
        System.out.println("4. Show");
        System.out.println("5. Exit" + "\n");
        System.out.print("Your choice: ");
    }
}
