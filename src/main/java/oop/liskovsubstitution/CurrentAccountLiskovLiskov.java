package oop.liskovsubstitution;

public class CurrentAccountLiskovLiskov extends WithdrawableAccountLiskov {
    @Override
    public void deposit(long number) {

    }

    @Override
    public long withdraw() {
        return 0;
    }
}
