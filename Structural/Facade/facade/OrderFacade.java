package Structural.Facade.facade;

import Structural.Facade.delivery.DeliveryService;
import Structural.Facade.inventory.InventoryService;
import Structural.Facade.model.OrderRequest;
import Structural.Facade.notification.NotificationService;
import Structural.Facade.payment.PaymentService;
/**
 * Facade class
 * ----------------
 * - Hides complexity of multiple subsystems
 * - Controls order of execution
 * - Accepts client-driven input
 */
public class OrderFacade {
    private final InventoryService inventoryService;
    private final DeliveryService deliveryService;
    private final NotificationService notificationService;
    private final PaymentService paymentService;


    public OrderFacade() {
        // facade decide how subsytem are created.
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.deliveryService = new DeliveryService();
        this.notificationService = new NotificationService();
    }
    /**
     * Single simplified entry point for order placement
     */
    public void placeOrder(OrderRequest request){
        // inventry check depends on the restaurantid and itemId.
        inventoryService.checkInventory(request.restaurantId,request.itemId);

        //Payment check(depends on the payment and amount)
        paymentService.pay(request.paymentMode, request.amount);

        //Delivery assignment (depends on delivery type)
        deliveryService.assignDelivery(request.deliveryType);

        //notification (depends on client preference)
        notificationService.notifyUser(request.email,request.sms);

        System.out.println("Order placed successfully");

    }

}