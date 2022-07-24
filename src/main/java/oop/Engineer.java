package oop;

public class Engineer extends Person {

    public Engineer() {

    }

    public Engineer(String name, String address) {
        this.name = name;
        this.address = address;

    }

    @Override
    public void calculateSalary() {

    }

    public void setName(String sName) {
        this.name = sName;
    }
}
