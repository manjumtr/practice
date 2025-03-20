package problems.coffeevendingmachine.domain;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMenu {
    private List<Coffee> menu = new ArrayList<>();


    public CoffeeMenu(){}
    public List<Coffee> getMenu() {
        return menu;
    }

    public void setMenu(List<Coffee> menu) {
        this.menu = menu;
    }

    public CoffeeMenu(List<Coffee> menu) {
        this.menu = menu;
    }
}
