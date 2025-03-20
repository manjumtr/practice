package problems.coffeevendingmachine.service;

import problems.coffeevendingmachine.domain.Inventory;
import problems.coffeevendingmachine.domain.Item;

import java.util.Map;

public class InventoryService {
    private static Inventory inventory = new Inventory();

    public static void display() {
        Map<String, Integer> items = inventory.getItems();
        for (Map.Entry<String, Integer> item : items.entrySet()) {
            System.out.println(item.getKey() + ":" + item.getValue());
        }
    }

    public static void add(String id, String name) {
        Map<String, Integer> items = inventory.getItems();
        Item item = new Item(id, name);
        if (items.containsKey(name)) {
            Integer value = items.get(name);
            items.put(name, value + 1);
        } else {
            items.put(name, 1);
        }
    }

    public static boolean isAvailable(String checkItem, Integer required) {
        Map<String, Integer> items = inventory.getItems();
        for (Map.Entry<String, Integer> item : items.entrySet()) {
            if (checkItem.equals(item.getKey()) && item.getValue() >= required) {
                return true;
            }
        }
        return false;
    }

    public static Inventory getInventory() {
        return inventory;
    }
}