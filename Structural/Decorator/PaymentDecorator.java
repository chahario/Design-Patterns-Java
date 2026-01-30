package Structural.Decorator;
import Structural.Decorator.Payment;

public abstract class PaymentDecorator implements Payment{
    protected Payment payment; // Has-A Payment

    public PaymentDecorator(Payment payment){
        this.payment = payment;
    }
}