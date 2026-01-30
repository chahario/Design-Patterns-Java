package Structural.Facade.order;

// order placement
//When a user places an order, the system must:
//Decide payment method (UPI / Card / COD)
//Check restaurant inventory (restaurant , item)
//Choose delivery type (Bike / Partner / Pickup)
//Send notifications (SMS / Email / None)
//All of these depend on client input
import Structural.Facade.model.OrderRequest;
import Structural.Facade.facade.OrderFacade;

public class OrderService {
    private final OrderFacade orderFacade;

    public OrderService(OrderFacade orderFacade){
        this.orderFacade = orderFacade;
    }

    public void placeOrder(OrderRequest request){
        // Basic validation (business responsibility)
        if (request.amount <=0){
            throw new IllegalArgumentException("amount must be greater than 0");
        }
        if (request.restaurantId == null || request.restaurantId.isEmpty()) {
            throw new IllegalArgumentException("restaurantId cannot be empty");
        }
        if (request.itemId == null || request.itemId.isEmpty()) {
            throw new IllegalArgumentException("itemId cannot be empty");
        }

        orderFacade.placeOrder(request);
    }

}