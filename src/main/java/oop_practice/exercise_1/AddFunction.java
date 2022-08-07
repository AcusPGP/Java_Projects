package oop_practice.exercise_1;

import java.util.Scanner;

public class AddFunction {
    Scanner sc = new Scanner(System.in);

    public void addWorker() {
        System.out.println("\n");
        String id = getId();
        String name = getName();
        String age = getAge();
        String address = getAddress();
        String type = "worker";
        TextFile text = new TextFile();
        text.text(id, name, age, address, type);
    }

    public void addEngineer() {
        System.out.println("\n");
        String id = getId();
        String name = getName();
        String age = getAge();
        String address = getAddress();
        String type = "engineer";
        TextFile text = new TextFile();
        text.text(id, name, age, address, type);
    }

    public void addProfessor() {
        System.out.println("\n");
        String id = getId();
        String name = getName();
        String age = getAge();
        String address = getAddress();
        String type = "professor";
        TextFile text = new TextFile();
        text.text(id, name, age, address, type);
    }

    private String getId() {
        String id;
        System.out.print("Input id: ");
        id = sc.nextLine().trim();
        try {
            Integer.parseInt(id);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please try again");
            return getId();
        }
        return id;
    }

    private String getName() {
        String name;
        System.out.print("Input name: ");
        name = sc.nextLine().trim();
        return name;
    }

    private String getAge() {
        String age;
        int temp;
        System.out.print("Input age: ");
        age = sc.nextLine().trim();
        try {
            temp = Integer.parseInt(age);
            if (temp >= 0 || temp <= 100) {
                return age;
            } else {
                System.out.println("Invalid age!");
                getAge();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please try again");
            return getId();
        }
        return age;
    }

    private String getAddress() {
        String address;
        System.out.print("Input address: ");
        address = sc.nextLine().trim();
        return address;
    }
}
