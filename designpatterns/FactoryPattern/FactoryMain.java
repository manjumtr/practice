package designpatterns.FactoryPattern;

public class FactoryMain {

    public static void main(String[] args) {

        AnimalFactory factory = new AnimalFactory();
        factory.getAnimal("j").walks();
    }
}
