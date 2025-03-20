package designpatterns.ObserverPattern;

public interface Publisher {
    void addSubscriber(Subscriber subscriber);

    void deleteSubscriber(Subscriber subscriber);

    void notifySubscribers();

    String getName();

}
