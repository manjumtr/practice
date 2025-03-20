package problems.coffeevendingmachine.states;

import problems.coffeevendingmachine.domain.Coffee;
import problems.coffeevendingmachine.domain.CoffeeMachine;
import problems.coffeevendingmachine.enums.Coin;

import java.util.List;

public abstract class CoffeeMachineState {

    public abstract void showState();

    public void displayCoffeeMenu(CoffeeMachine machine) {
        System.out.println("Error");
    }

    public void selectCoffee(CoffeeMachine machine, Coffee coffee) {
        System.out.println("Error");
    }

    public void insertCoins(CoffeeMachine machine, List<Coin> coins) {
        System.out.println("Error");
    }

    public void dispenseCoffee(CoffeeMachine machine) {
        System.out.println("Error");
    }

    public void exit() {
        System.out.println("Error");
    }


}
