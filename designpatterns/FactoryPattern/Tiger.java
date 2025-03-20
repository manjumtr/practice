package designpatterns.FactoryPattern;

public class Tiger implements Animal {

    private static String TIGER = "Tiger";

    @Override
    public void walks() {
        System.out.println(TIGER + " walks");
    }

    public String type() {
        return TIGER;
    }
}
