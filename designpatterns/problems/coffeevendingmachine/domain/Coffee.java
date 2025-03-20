package problems.coffeevendingmachine.domain;

import problems.coffeevendingmachine.enums.CoffeeType;

import java.util.List;
import java.util.Map;

public class Coffee {
    private String id;
    private String name;
    private double price;
    private Map<String,Integer> ingredients;
    private CoffeeType type;

    public Coffee(String id, String name, CoffeeType type, double price, Map<String,Integer> ingredients) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoffeeType getDescription() {
        return type;
    }

    public void setDescription(CoffeeType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Map<String,Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<String,Integer> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='"  + '\'' +
                ", price=" + price +
                ", ingredients=" + ingredients +
                '}';
    }
}
