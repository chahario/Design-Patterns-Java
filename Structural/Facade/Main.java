package Structural.Facade;

import Structural.Facade.model.OrderRequest;
import Structural.Facade.order.OrderService;
import Structural.Facade.facade.OrderFacade;


public class Main {
    public static void main(String[] args) {
        OrderRequest request = new OrderRequest();
        request.restaurantId = "REST123";
        request.paymentMode = "UPI";
        request.itemId = "Burger";
        request.deliveryType = "BIKE";
        request.sms = true;
        request.email = false;
        request.amount = 499;

        OrderFacade orderFacade = new OrderFacade();
        OrderService orderService = new OrderService(orderFacade);
        orderService.placeOrder(request);
    }
}