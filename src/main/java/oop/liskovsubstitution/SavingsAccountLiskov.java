package oop.liskovsubstitution;

public class SavingsAccountLiskov extends WithdrawableAccountLiskov {
    @Override
    public void deposit(long money) {
        System.out.println("SavingsAccountLiskov withdraw " + money);
    }

    @Override
    public void withdraw(long money) {
        System.out.println("SavingsAccountLiskov withdraw " + money);
    }
}
