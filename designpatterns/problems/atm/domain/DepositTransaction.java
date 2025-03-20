package problems.atm.domain;

import problems.atm.TransactionType;

import java.time.LocalDate;

public class DepositTransaction extends Transaction {
    public DepositTransaction(double amount, LocalDate transactionDate, BankAccount bankAccount, User user) {
        super(amount, TransactionType.DEPOSIT, transactionDate, bankAccount, user);
    }

    @Override
    public void doTransaction() {
        BankAccount account = getBankAccount();
        account.deposit(getAmount());
    }
}
