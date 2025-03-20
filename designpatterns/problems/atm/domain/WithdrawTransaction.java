package problems.atm.domain;

import problems.atm.TransactionType;

import java.time.LocalDate;

public class WithdrawTransaction extends Transaction {
    public WithdrawTransaction(double amount, LocalDate transactionDate, BankAccount account,User user) {
        super(amount, TransactionType.WITHDRAW, transactionDate, account, user);
    }

    @Override
    public void doTransaction() {
        BankAccount account = getBankAccount();
        double amount = getAmount();
        if (account.getBalance() < amount) {
            System.out.println("Insufficient Balance..!");
        } else {
            account.withdraw(amount);
        }
    }
}
