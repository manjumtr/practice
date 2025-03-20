package problems.bookmyshow.service;

import problems.bookmyshow.enums.PaymentType;

public class PaymentService {
    private static PaymentServiceProvider service;

    public static void paymentService(PaymentType type) {
        switch (type) {
            case GPAY:
                service = new GPayPaymentService();
                break;
            case PHONEPE:
                service = new PhonePePaymentService();
                break;
            default:
                System.out.println("Invalid payment type");
        }
    }

    public static void pay(double amount) {
        service.pay(amount);
    }
}
