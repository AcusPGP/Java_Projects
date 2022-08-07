package oop_practice.exercise_1;

import java.util.Scanner;

public class OptionAdd {
    public void add() {
        Scanner sc = new Scanner(System.in);
        showAddOption();
        String option = sc.nextLine();
        boolean exit = false;
        while (true) {
            switch (Integer.parseInt(option)) {
                case 1:
                    AddFunction worker = new AddFunction();
                    worker.addWorker();
                    exit = true;
                    break;
                case 2:
                    AddFunction engineer = new AddFunction();
                    engineer.addEngineer();
                    exit = true;
                    break;
                case 3:
                    AddFunction professor = new AddFunction();
                    professor.addProfessor();
                    exit = true;
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("\n" + "Invalid input! Please try again.");
            }
            if (exit) {
                break;
            }
        }
    }

    static void showAddOption() {
        System.out.println("The add option menu: " + "\n");
        System.out.println("1. Add a worker");
        System.out.println("2. Add a engineer");
        System.out.println("3. Add a professor");
        System.out.println("4. Exit" + "\n");
        System.out.print("Your choice: ");
    }
}

