package problems.atm.state;

import problems.atm.domain.ATM;
import problems.atm.domain.Card;

public class IdleState extends ATMState {
    @Override
    public void getState() {
        System.out.println("ATM is in Idle State");
    }

    @Override
    public void insertCard(Card card, ATM atm) {
        System.out.println("Card Inserted..!!");
        atm.setState(new CardInserted());


    }
}
