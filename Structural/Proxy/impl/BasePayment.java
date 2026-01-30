package Structural.Proxy.impl;

import Structural.Proxy.Payment;

public class BasePayment implements Payment{
    @Override
    public void pay() {
        System.out.println("payment Processing .. from base payment");
    }
}