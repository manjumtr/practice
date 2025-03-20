package problems.atm.domain;

import problems.atm.TransactionType;

import java.time.LocalDate;

public abstract class Transaction {
    private double amount;
    private TransactionType type;

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", type=" + type +
                ", transactionDate=" + transactionDate +
                ", bankAccount=" + bankAccount +
                ", user=" + user +
                '}';
    }

    private LocalDate transactionDate;
    private BankAccount bankAccount;
    private User user;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Transaction(double amount, TransactionType type, LocalDate transactionDate, BankAccount bankAccount, User user) {
        this.amount = amount;
        this.type = type;
        this.transactionDate = transactionDate;
        this.bankAccount = bankAccount;
        this.user = user;
    }

    public abstract void doTransaction();
}
