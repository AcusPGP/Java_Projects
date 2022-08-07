package oop_practice.main;

public class Car {
    String car = "Mercedes";
    String model = "SUV";
    double price = 50000.0;
    String color = "blue";
    boolean sold = true;

    String text = car + " " + model + " " + price + " " + color + " " + sold;

    void drive () {
        System.out.println("You drive your car.");
    }

    void brake() {
        System.out.println("You step on the brakes.");
    }
}
