package designpatterns.FactoryPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnimalFactory {
    Map<String, Animal> map = new HashMap<>();

    public AnimalFactory() {
    }

    public Animal getAnimal(final String type) {
        Animal animal = new DefaultAnimal();
        switch (type) {
            case "LION":
                animal = new Lion();
                break;
            case "TIGER":
                animal = new Tiger();
                break;
            default:
                break;
        }
        return animal;
    }
}
