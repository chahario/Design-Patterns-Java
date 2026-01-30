package Structural.Decorator.decoimpl;

import Structural.Decorator.Payment;
import Structural.Decorator.PaymentDecorator;

public class LoggingPayment extends PaymentDecorator{
    public LoggingPayment(Payment payment) {
        super(payment);
    }
    @Override
    public void pay() {
        System.out.println("Logging: Payment Started!");
        payment.pay(); // delegate to wrapped object.
        System.out.println("Logging: Payment Finished!");
    }
}