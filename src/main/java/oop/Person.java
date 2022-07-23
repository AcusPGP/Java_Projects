package oop;

public abstract class Person implements IGeneral {

    private String name;

    private int age;

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
