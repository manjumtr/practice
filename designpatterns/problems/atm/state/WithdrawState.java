package problems.atm.state;

import problems.atm.domain.ATM;
import problems.atm.domain.BankAccount;
import problems.atm.domain.Card;
import problems.atm.service.TransactionService;

public class WithdrawState extends ATMState {
    @Override
    public void getState() {
        System.out.println("In withdraw state");
    }

    @Override
    public void withdraw(ATM atm, Card card, double amount) {
        BankAccount account = card.getAccount();
        TransactionService.withdraw(account, amount, null);
        atm.setState(new CardValidated());

    }
}
