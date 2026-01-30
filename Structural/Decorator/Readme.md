#### Imp:
    - Code to an interface (or parent class), not to a concrete class.
    - Open/Closed Principle. 
    - Method execution depends on the OBJECT, not the variable type.
#### Intent
    - Design patterns are about Intent, not Capability.
    - add behaviour to an object transparently, without changing its interface.
    - key Assumptions of decorator:
        - The wrapped object already exist.
        - Decorator does not decide when to CREATE it.
        - Decorator only decides HOW to enhance behaviour.
    - Decorator answers:
        - what extra behaviour should happen? that's all

### Basic OOPs Concept.
    - Override 
        - Eg: Dog() Extends Animal()
        - {Animal a = new Dog();
        - a.speak()};
        - Variable is Animal , Actual Object - Dog
        - JVM decides at runtime which method to call -- This is runtime Polymorphism.
        - A method is overridden If and only if all these rules are true
            - child extend parent.
            - method name, method parameters are same and return types are compatible.
            - method is not private, method is not final.
        - @Override annotation is a compiler check, not a language check. It tells the compiler, I intend to override a parent method. please verify this.
    - One feature per class (Single responsibility) (SOLID Principle) 
    - Why composition(HAS -a) not inheritence(Is-a)?
        - Class Explosion - too many subclasses created for feature combinations.
        - Each new feature multiple the classes.
        - Behaviour Fixed at object creation, Once u choose a subclass , can't add/remove feature dynamically.
        - Inheritance - Static Behaviour (behaviour is defined by class design, not runtime composition) 
    - Abstract:
        - A abstract class is an incomplete class that cannot be instantiated.
        - Abstract class - a partially implemented class that cannot be instantiated but can define state, behavior, and enforce contracts on subclasses.
        - Think of it as a template, not real object.
        - use abstract keyword to mark the class as abstract and also for the function
        - Abstract means incomplete behavior , so there is no abstract variable as variables don't have behavior.
        - Abstract class and functions cannot be final , private, but the variable inside the abstract class can be anything but abstract.
        - So some class should extend the abstract class.

- #### Decorator lets you add behavior to an object at runtime(so need polymorphism) by wrapping it with another object of the same type.

- ##### Decorator needs an interface of the class, whose u want to decorate as it needs polymorphism.

- #### Objects store in Heap, created using new. Stack where methods runs , one stack frame per method call, destroyed when method returns.

- #### Decorator form a chain in the Heap, and method call walk through that chain using the stack.