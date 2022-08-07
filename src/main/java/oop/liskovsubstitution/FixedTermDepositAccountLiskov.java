package oop.liskovsubstitution;

public class FixedTermDepositAccountLiskov extends AccountLiskov {
    @Override
    public void deposit(long money) {
        System.out.println("FixedTermDepositAccountLiskov withdraw " + money);
    }
}
