package designpatterns.ObserverPattern;

public class ObserverMain {
    public static void main(String[] args) {
        Subscriber manju = new User("manju");
        Subscriber virat = new User("virat");
        Subscriber kohli = new User("kohli");

        Publisher iphonePublisher = new IphonePublisher("Iphone");
        Publisher ipadPublisher = new IpadPublisher("Ipad");
        iphonePublisher.addSubscriber(manju);
        iphonePublisher.addSubscriber(virat);
        iphonePublisher.addSubscriber(kohli);

        iphonePublisher.notifySubscribers();

        System.out.println("------- Deleted -------");
        iphonePublisher.deleteSubscriber(virat);
        ipadPublisher.addSubscriber(virat);
        iphonePublisher.notifySubscribers();
        ipadPublisher.notifySubscribers();

    }

}
