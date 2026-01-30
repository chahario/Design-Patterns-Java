package Structural.Decorator;

import Structural.Decorator.Payment;
import Structural.Decorator.impl.CorePayment;
import Structural.Decorator.decoimpl.LoggingPayment;
import Structural.Decorator.decoimpl.RetryPayment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new CorePayment();
        payment = new LoggingPayment(payment); // stack decorators
        payment = new RetryPayment(payment);

        payment.pay();
    }
}