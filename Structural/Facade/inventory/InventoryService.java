package Structural.Facade.inventory;


public class InventoryService{
    public void checkInventory(String restaurantId, String itemId){
        System.out.println("Checking Inventory from Restaurant bearing Restaurant ID: " + restaurantId +
                "of the Item with Itemid: " + itemId);
    }
}