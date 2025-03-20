package designpatterns.StrategyPattern;

public class CreditCardPayment implements PaymentType {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "  using Credit Card");

    }

}
