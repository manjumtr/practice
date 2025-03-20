package problems.coffeevendingmachine.states;

import problems.coffeevendingmachine.domain.Coffee;
import problems.coffeevendingmachine.domain.CoffeeMachine;
import problems.coffeevendingmachine.service.CoffeeMachineService;

import java.util.List;

public class IdleSatete extends CoffeeMachineState {


    @Override
    public void showState() {
        System.out.println("Idle State");
    }

    @Override
    public void displayCoffeeMenu(CoffeeMachine machine) {
        System.out.println("Available Coffee");
        List<Coffee> coffeeMenu = machine.getMenu().getMenu();
        for (Coffee coffee : coffeeMenu) {
            System.out.println(coffee);
        }

        machine.setState(new SelectCoffeeState());
    }
}
