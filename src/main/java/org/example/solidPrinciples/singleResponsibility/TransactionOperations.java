package org.example.solidPrinciples.singleResponsibility;

import java.math.BigDecimal;

public class TransactionOperations {
    public void deposit(int accountNumber, BigDecimal amount){
        AccountOperations operations = new AccountOperations();
        Account account = operations.getAccount(accountNumber);
        account.setAmount(account.getAmount().add(amount));
    }

    public void withdraw(int accountNumber, BigDecimal amount){
        AccountOperations operations = new AccountOperations();
        Account account = operations.getAccount(accountNumber);
        account.setAmount(account.getAmount().subtract(amount));
    }

}
