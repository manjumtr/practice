package designpatterns.StateDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<String, Integer> availableProducts = new HashMap<>();

    void addProduct(Product product) {
        if (availableProducts.containsKey(product.name)) {
            Integer count = availableProducts.get(product.name);
            count++;
            availableProducts.put(product.name, count);

        } else {
            availableProducts.put(product.name, 1);
        }
    }

    public boolean isAvailable(final Product product) {
        return availableProducts.get(product.name) > 0 ? true : false;
    }
}
