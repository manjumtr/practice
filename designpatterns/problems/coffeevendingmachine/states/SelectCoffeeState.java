package problems.coffeevendingmachine.states;

import problems.coffeevendingmachine.domain.Coffee;
import problems.coffeevendingmachine.domain.CoffeeMachine;
import problems.coffeevendingmachine.enums.Coin;

import java.util.List;

public class SelectCoffeeState extends CoffeeMachineState {


    @Override
    public void showState() {
        System.out.println("Select coffee state");
    }

    @Override
    public void selectCoffee(CoffeeMachine machine, Coffee coffee) {
        System.out.println("You have selected " + coffee.getName());
        machine.setSelectedCoffee(coffee);
        machine.setState(new InsertCoinState());
    }
}
