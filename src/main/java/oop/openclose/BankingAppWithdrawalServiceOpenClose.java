package oop.openclose;

import java.util.ArrayList;

public class BankingAppWithdrawalServiceOpenClose {

    ArrayList<AccountOpenClose> listAccountOpenClose;

    BankingAppWithdrawalServiceOpenClose() {
        listAccountOpenClose = new ArrayList<>();

        CurrentAccountOpenClose account = new CurrentAccountOpenClose();
        listAccountOpenClose.add(account);

        SavingAccountOpenClose savingAccount = new SavingAccountOpenClose();
        listAccountOpenClose.add(savingAccount);
    }

    public void proceed() {

        for(AccountOpenClose accountOpenClose : listAccountOpenClose) {
            accountOpenClose.deposit(0);
            accountOpenClose.withDraw();
        }
    }

    public static void main(String[] args) {
        BankingAppWithdrawalServiceOpenClose bankingAppWithdrawalServiceOpenClose = new BankingAppWithdrawalServiceOpenClose();
        bankingAppWithdrawalServiceOpenClose.proceed();
    }
}
