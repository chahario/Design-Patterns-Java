#### Definition
    - Facade pattern provides a simple interface to a complex system of classes, lib, or subsystems.
    - Dependency Inversion Principle
    
#### Intent
    - Hide system complexity
    - Decoupling and reduce dependency between client and subsytems
#### Key Idea
    - clinet takes to one class (Facade) instead of many subsystem classes.
#### Example
    - OrderFacade
        - PaymentService
        - InventoryService
        - DeliveryService
        - NotificationService