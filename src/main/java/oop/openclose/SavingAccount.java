package oop.openclose;

public class SavingAccount extends Account {
    @Override
    public void deposit(long value) {
        System.out.println("SavingAccount deposit");
    }

    @Override
    public long withDraw() {
        System.out.println("SavingAccount withDraw");
        return 0;
    }
}
