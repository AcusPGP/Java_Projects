package oop.openclose;

public class CurrentAccountOpenClose extends AccountOpenClose {
    @Override
    public void deposit(long value) {
        System.out.println("CurrentAccount deposit");
    }

    @Override
    public long withDraw() {
        System.out.println("CurrentAccount withDraw");
        return 0;
    }
}
