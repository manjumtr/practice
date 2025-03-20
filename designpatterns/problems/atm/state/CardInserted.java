package problems.atm.state;

import problems.atm.domain.ATM;
import problems.atm.domain.Card;

public class CardInserted extends ATMState{
    @Override
    public void getState() {
        System.out.println("ATM card inserted");
    }

    @Override
    public void validate(ATM atm, Card card, String pin) {
        if(!card.getPin().equals(pin)){
            System.out.println("Invalid pin..!!");
        }
        else{
            atm.setState(new CardValidated());

        }
    }
}
