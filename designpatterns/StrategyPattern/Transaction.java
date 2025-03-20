package designpatterns.StrategyPattern;

public class Transaction {
    private final PaymentType paymentType;

    public Transaction(final PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void doPayment(double amount) {
        this.paymentType.pay(amount);
    }
}
