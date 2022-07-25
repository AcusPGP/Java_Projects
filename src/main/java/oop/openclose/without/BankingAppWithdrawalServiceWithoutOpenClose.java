package oop.openclose.without;

import java.util.ArrayList;

public class BankingAppWithdrawalServiceWithoutOpenClose {

    ArrayList listAccount = new ArrayList();

    public BankingAppWithdrawalServiceWithoutOpenClose() {
        CurrentAccountWithoutOpenClose current = new CurrentAccountWithoutOpenClose() ;
        listAccount.add(current);

        SavingAccountWithoutOpenClose saving = new SavingAccountWithoutOpenClose();
        listAccount.add(saving);
    }

    public void proceed() {
        for(int i=0;i<listAccount.size();i++) {
            if(listAccount.get(i) instanceof CurrentAccountWithoutOpenClose) {

            } else if (listAccount.get(i) instanceof SavingAccountWithoutOpenClose) {

            }
        }
    }

}
