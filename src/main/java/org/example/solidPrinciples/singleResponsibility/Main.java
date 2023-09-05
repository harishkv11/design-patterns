package org.example.solidPrinciples.singleResponsibility;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Harish");
        account.setAmount(BigDecimal.valueOf(100000));
        account.setAccountNumber(1000);

        AccountOperations operations = new AccountOperations();
        operations.addAccount(account);
        System.out.println(operations.getAccount(account.getAccountNumber()).toString());

        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(account.getAccountNumber(), BigDecimal.valueOf(100));
        operations.updateAccount(account);
        System.out.println(operations.getAccount(account.getAccountNumber()).toString());

        transactionOperations.withdraw(account.getAccountNumber(), BigDecimal.valueOf(999));
        operations.updateAccount(account);
        System.out.println(operations.getAccount(account.getAccountNumber()).toString());
    }
}
