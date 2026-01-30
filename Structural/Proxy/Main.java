package Structural.Proxy;

import Structural.Proxy.Payment;
import Structural.Proxy.proxyimpl.PaymentProxy;

//lazy + access proxy
public class Main {
    public static void main(String[] args) {
        Payment payment = new PaymentProxy("Admin");
        payment.pay();
    }
}