package designpatterns.StrategyPattern;

public class UPIPayment implements PaymentType {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " through UPI");
    }

}
