package problems.atm.state;

import problems.atm.TransactionType;
import problems.atm.domain.ATM;
import problems.atm.domain.Card;

public class CardValidated extends ATMState {
    @Override
    public void getState() {
        System.out.println("Card Validated.. ");
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType type) {
        switch (type) {
            case WITHDRAW:
                atm.setState(new WithdrawState());
                break;

            case BALANCE_CHECK:
                atm.setState(new BalanceCheckState());
                break;
            default:
                System.out.println("Invalid type");
        }
    }
}
