package designpatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class IpadPublisher implements Publisher {
    String name;

    public IpadPublisher(String name) {
        this.name = name;
    }

    List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);

    }

    @Override
    public void deleteSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update("Ipad");
        }

    }

    @Override
    public String getName() {
        return "Iphone";
    }

}
