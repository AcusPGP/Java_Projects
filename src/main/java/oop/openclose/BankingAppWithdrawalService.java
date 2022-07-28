package oop.openclose;

import java.util.ArrayList;

public class BankingAppWithdrawalService {

    ArrayList<Account> listAccount;

    BankingAppWithdrawalService() {
        listAccount = new ArrayList<>();

        CurrentAccount account = new CurrentAccount();
        listAccount.add(account);

        SavingAccount savingAccount = new SavingAccount();
        listAccount.add(savingAccount);
    }

    public void proceed() {

        for(Account account:listAccount) {
            account.deposit(0);
            account.withDraw();
        }
    }

    public static void main(String[] args) {
        BankingAppWithdrawalService bankingAppWithdrawalService = new BankingAppWithdrawalService();
        bankingAppWithdrawalService.proceed();
    }
}
