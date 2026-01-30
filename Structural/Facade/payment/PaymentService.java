package Structural.Facade.payment;


public class PaymentService {
    public void pay(String paymentMode, double paymentAmount) {
        System.out.println("Payment of: " + paymentMode + "using Payment Mode: " + paymentMode);
    }
}