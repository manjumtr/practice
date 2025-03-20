package problems.atm.state;

import problems.atm.TransactionType;
import problems.atm.domain.ATM;
import problems.atm.domain.Card;

public abstract class ATMState {
    public void insertCard(Card card, ATM atm) {
        System.out.println("Something went wrong");
    }

    public void validate(ATM atm,Card card, String pin) {
        System.out.println("Something went wrong");
    }

    public void selectOperation(ATM atm,Card card, TransactionType type) {
        System.out.println("Something went wrong");
    }

    public void checkBalance(ATM atm,Card card) {
        System.out.println("Something went wrong");
    }

    public void withdraw(ATM atm,Card card, double amount) {
        System.out.println("Something went wrong");
    }

    public void exit(ATM atm) {
        System.out.println("Something went wrong");
    }

    public abstract void getState();
}
