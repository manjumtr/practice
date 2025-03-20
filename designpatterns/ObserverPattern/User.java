package designpatterns.ObserverPattern;

public class User implements Subscriber {
    public String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String product) {
        System.out.println("Hello " + this.name + ", " + product + " is now available");
    }
}
