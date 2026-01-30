package Structural.Decorator.impl;

import Structural.Decorator.Payment;

public class CorePayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment Done. This is from CorePayment");
    }
}