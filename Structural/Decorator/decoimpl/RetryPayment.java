package Structural.Decorator.decoimpl;

import Structural.Decorator.Payment;
import Structural.Decorator.PaymentDecorator;

public class RetryPayment extends PaymentDecorator{
    public RetryPayment(Payment payment){
        super(payment);
    }
    @Override
    public void pay(){
        System.out.println("Logging: Retry Started!");
        payment.pay();
        System.out.println("Logging: Retry Payment Done!");
    }
}