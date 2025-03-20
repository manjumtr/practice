package problems.coffeevendingmachine.states;

import problems.coffeevendingmachine.domain.CoffeeMachine;
import problems.coffeevendingmachine.enums.Coin;

import java.util.List;

public class InsertCoinState extends CoffeeMachineState{
    @Override
    public void showState() {
        System.out.println("Insert coins state");

    }

    @Override
    public void insertCoins(CoffeeMachine machine, List<Coin> coins) {
        machine.setCoins(coins);
        machine.setState(new DispenseState());
    }
}
