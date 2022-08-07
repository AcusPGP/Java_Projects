package oop.openclose;

public class SavingAccountOpenClose extends AccountOpenClose {
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
