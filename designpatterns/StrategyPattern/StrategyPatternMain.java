package designpatterns.StrategyPattern;

public class StrategyPatternMain {
    public static void main(String[] args) {
        Transaction creditCardPaymentTransaction = new Transaction(new CreditCardPayment());
        Transaction upiPaymentTransaction = new Transaction(new UPIPayment());
        creditCardPaymentTransaction.doPayment(100);
        upiPaymentTransaction.doPayment(200);

    }

}
