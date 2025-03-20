package problems.atm.state;

import problems.atm.domain.ATM;
import problems.atm.domain.Card;

public class BalanceCheckState extends ATMState{
    @Override
    public void getState() {
        System.out.println("Balance Check state");
    }


    @Override
    public void checkBalance(ATM atm, Card card) {
        System.out.println(card.getAccount().getBalance());
        atm.setState(new CardValidated());
    }
}
