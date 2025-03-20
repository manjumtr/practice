package problems.coffeevendingmachine;

import problems.coffeevendingmachine.domain.Coffee;
import problems.coffeevendingmachine.domain.CoffeeMachine;
import problems.coffeevendingmachine.domain.CoffeeMenu;
import problems.coffeevendingmachine.enums.CoffeeType;
import problems.coffeevendingmachine.enums.Coin;
import problems.coffeevendingmachine.service.CoffeeMachineService;
import problems.coffeevendingmachine.service.InventoryService;
import problems.coffeevendingmachine.states.IdleSatete;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoffeeDay {
    public static void main(String[] args) {
        InventoryService.add("M001", "Milk");
        InventoryService.add("C001", "Coffee Powder");
        Map<String, Integer> cappucinoIngredients = new HashMap<>();
        cappucinoIngredients.put("Milk", 1);
        cappucinoIngredients.put("Coffee Powder", 1);

        Coffee coffee = CoffeeMachineService.addCoffeeMenu("C001", "Cappuccino", CoffeeType.CAPPUCCINO, cappucinoIngredients, 10.00);

        CoffeeMenu coffeeMenu = new CoffeeMenu(CoffeeMachineService.getCoffeeMenu());

        CoffeeMachine machine = new CoffeeMachine();
        machine.setInventory(InventoryService.getInventory());
        machine.setMenu(coffeeMenu);

        System.out.println("Before: " + machine.getInventory());
        machine.setState(new IdleSatete());
        machine.getState().displayCoffeeMenu(machine);
        machine.getState().selectCoffee(machine, coffee);
        List<Coin> coins = Arrays.asList(Coin.TEN, Coin.FIVE);
        machine.getState().insertCoins(machine, coins);
        machine.getState().dispenseCoffee(machine);
        System.out.println("After : " + machine.getInventory());


    }
}
