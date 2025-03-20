package problems.bookmyshow.service;

public class GPayPaymentService implements PaymentServiceProvider {

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" through gpay..");
    }
}
