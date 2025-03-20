package designpatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class IphonePublisher implements Publisher {

    String name;

    public IphonePublisher(String name) {
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
            subscriber.update("Iphone");
        }
    }

    @Override
    public String getName() {
        return "Ipad";
    }
}
