package problems.atm;

import problems.atm.domain.ATM;
import problems.atm.domain.BankAccount;
import problems.atm.domain.Card;
import problems.atm.domain.User;
import problems.atm.service.TransactionService;
import problems.atm.state.ATMState;
import problems.atm.state.IdleState;


public class ATMMachine {

    public static void main(String[] args) {

        ATM atm = new ATM(10000, 2, 10, 10, new IdleState());

        BankAccount bankAccount = new BankAccount("SBI", "33079460510", 1000);
        Card card = new Card("987676545654", "9488", bankAccount);
        User user = new User("Manju", card, bankAccount);

        atm.getState().insertCard(card,atm);
        atm.getState().validate(atm,card,"9488");

        atm.getState().selectOperation(atm,card,TransactionType.BALANCE_CHECK);
        atm.getState().checkBalance(atm,card);

        atm.getState().selectOperation(atm,card,TransactionType.WITHDRAW);
        atm.getState().withdraw(atm,card,100);

        atm.getState().selectOperation(atm,card,TransactionType.BALANCE_CHECK);
        atm.getState().checkBalance(atm,card);

        TransactionService.displayTransactions();
    }
}
