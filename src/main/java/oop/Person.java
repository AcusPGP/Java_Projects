package oop;

public abstract class Person implements IGeneral {


    String name;

    int age;

    String address;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void setName(String sName) {
        this.name = sName;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

}
