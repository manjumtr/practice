package problems.bookmyshow.service;

public class PhonePePaymentService implements  PaymentServiceProvider{
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" through phonepe..");
    }
}
