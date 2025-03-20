package problems.coffeevendingmachine.service;

import problems.coffeevendingmachine.domain.Coffee;
import problems.coffeevendingmachine.domain.CoffeeMenu;
import problems.coffeevendingmachine.enums.CoffeeType;

import java.util.List;
import java.util.Map;

public class CoffeeMachineService {

    private static CoffeeMenu coffeeMenu = new CoffeeMenu();

    public static Coffee addCoffeeMenu(String id, String name, CoffeeType type, Map<String,Integer> ingredients, double price) {

        Coffee coffee = new Coffee(id, name, type, price, ingredients);
        coffeeMenu.getMenu().add(coffee);
        return coffee;
    }

    public static List<Coffee> getCoffeeMenu() {
        return coffeeMenu.getMenu();
    }

    public static void display(List<Coffee> cofeeMenu) {
        for(Coffee coffee: cofeeMenu){
            System.out.println(coffee);
        }
    }
}
