package org.example.solidPrinciples.singleResponsibility;

import java.util.HashMap;
import java.util.Map;

public class AccountOperations {
    private static Map<Integer, Account> accountMap = new HashMap<>();

    public void addAccount(Account account){
        accountMap.put(account.getAccountNumber(), account);
    }

    public void updateAccount(Account accout){
        accountMap.put(accout.getAccountNumber(), accout);
    }

    public Account getAccount(int accountNumber){
        return accountMap.get(accountNumber);
    }


    /*
    This should be moved to new Class.
     */
    public void deposit(int accountNumber, int amount){};
}
