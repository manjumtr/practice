package problems.coffeevendingmachine.states;

import problems.coffeevendingmachine.domain.Coffee;
import problems.coffeevendingmachine.domain.CoffeeMachine;
import problems.coffeevendingmachine.domain.Item;
import problems.coffeevendingmachine.enums.Coin;
import problems.coffeevendingmachine.service.InventoryService;

import java.util.List;
import java.util.Map;

public class DispenseState extends CoffeeMachineState {
    @Override
    public void showState() {
        System.out.println("Dispense State");

    }


    @Override
    public void dispenseCoffee(CoffeeMachine machine) {
        System.out.println("Pls Wait..!");
        int insertedMoney = 0;
        List<Coin> coins = machine.getCoins();
        for (Coin coin : coins) {
            insertedMoney += coin.getValue();
        }

        if (insertedMoney < machine.getSelectedCoffee().getPrice()) {
            System.out.println("Insufficient funds, refunding " + insertedMoney);
            machine.setState(new IdleSatete());

        } else {
            Coffee coffee = machine.getSelectedCoffee();
            for (Map.Entry<String, Integer> entry : coffee.getIngredients().entrySet()) {
                if (!InventoryService.isAvailable(entry.getKey(),entry.getValue())) {
                    System.out.println("Sorry" + entry.getKey() + " not available");
                    machine.setState(new IdleSatete());
                    return;
                }
            }

            System.out.println("Your " + machine.getSelectedCoffee().getName() + " is being prepared..!");

            for (Map.Entry<String, Integer> entry : machine.getInventory().getItems().entrySet()) {
                entry.setValue(entry.getValue() - 1);
            }
            System.out.println("Dispensing " + machine.getSelectedCoffee().getName());
            machine.setState(new IdleSatete());
        }
    }
}
