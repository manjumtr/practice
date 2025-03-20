package problems.atm.service;

import problems.atm.domain.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionService {
    static List<Transaction> transactions = new ArrayList<>();

    public static void deposit(BankAccount account, double amount, User user) {
        Transaction transaction = new DepositTransaction(amount, LocalDate.now(), account, user);
        transaction.doTransaction();
        transactions.add(transaction);
    }

    public static void withdraw(BankAccount account, double amount, User user) {
        Transaction transaction = new WithdrawTransaction(amount, LocalDate.now(), account, user);
        transaction.doTransaction();
        transactions.add(transaction);
    }

    public static void displayTransactions(){
        for(Transaction txn:transactions){
            System.out.println(txn);
        }
    }
}
