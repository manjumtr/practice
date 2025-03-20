package designpatterns.FactoryPattern;

public class Lion implements Animal {

    private static final String LION = "Lion";

    @Override
    public void walks() {
        System.out.println(LION + " walks");
    }

    public String type() {
        return LION;
    }
}
