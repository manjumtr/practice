package designpatterns.FactoryPattern;

public class DefaultAnimal implements Animal {

    @Override
    public void walks() {
        System.out.println("Invalid Animal");
    }

    @Override
    public String type() {
        return null;
    }
}
