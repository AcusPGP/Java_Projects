package oop.openclose;

public class SavingAccountOpenClose extends AccountOpenClose {
    @Override
    public void deposit(long value) {
        System.out.println("SavingAccount deposit");
    }

    @Override
    public void withDraw(long money) {
        System.out.println("SavingAccount withDraw " + money);
    }
}
