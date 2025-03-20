package problems.coffeevendingmachine.domain;

import problems.coffeevendingmachine.enums.Coin;
import problems.coffeevendingmachine.states.CoffeeMachineState;

import java.util.List;

public class CoffeeMachine {
    private CoffeeMachineState state;
    private Coffee selectedCoffee;
    private List<Coin> coins;
    private Inventory inventory;
    private CoffeeMenu menu;

    public CoffeeMachine() {

    }

    public CoffeeMachineState getState() {
        return state;
    }

    public void setState(CoffeeMachineState state) {
        this.state = state;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }

    public Coffee getSelectedCoffee() {
        return selectedCoffee;
    }

    public void setSelectedCoffee(Coffee selectedCoffee) {
        this.selectedCoffee = selectedCoffee;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public CoffeeMenu getMenu() {
        return menu;
    }

    public void setMenu(CoffeeMenu menu) {
        this.menu = menu;
    }
}
