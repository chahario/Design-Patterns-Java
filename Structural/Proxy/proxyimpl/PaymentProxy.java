package Structural.Proxy.proxyimpl;

import Structural.Proxy.Payment;
import Structural.Proxy.impl.BasePayment;

public class PaymentProxy implements Payment {

    private final String userRole; // userRole is internal state of proxy. so no one change it runtime. Security proxy become useless. Security-related state must be private. final -> assigned one and cannot be changed.
    private Payment realPayment; // final requires assignment in constructor but this object is created lazily.

    public PaymentProxy(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public void pay(){
        // Access control

        if (!"Admin".equals(userRole)){
            System.out.println("Access Denied : Insufficient permission.");
            return;
        }

        // Extra behaviour 

        System.out.println("Security check passed!");
        if (realPayment == null){
        realPayment = new BasePayment(); // lazily creating object.
        }

        realPayment.pay();

    }



    
}