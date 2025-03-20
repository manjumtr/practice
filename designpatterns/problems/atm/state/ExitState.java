package problems.atm.state;

import problems.atm.domain.ATM;

public class ExitState extends ATMState{
    @Override
    public void getState() {
        System.out.println("Txn Completed");
    }

    @Override
    public void exit(ATM atm) {
        atm.setState(new IdleState());
    }
}
