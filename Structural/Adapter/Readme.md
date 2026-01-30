### Core Idea : 
    Adapter makes incompatible interfaces work together.
### Think : 
    I have something i can't change, but i need it to fit my system.
#### Adapter = Wrapper + Translator
#### Smell of Adapter usage
    when 
        - Third-party Liberary
        - Legacy Code
        - External API
        - Aws/ Payment Gateway / SDK
    and think
        - Its interface doesn't match mine.
        - I don't want my whole codebase depending on this API.

#### Steps:
    - Create a interface (define)
    - Create Adapter (i.e implement the interface), Adapter Wraps the incompatible class.
    - Use Adapter Everywhere, Dependency is Injected.
    - Adapter Translates the call.

#### Why:
    - System depends on interfaces, not vendors
    - Easy to Swap implementations
    - Clean Testing 


#### Problem it solves:
    1) Already have a class , its method or parameters don't match what you want.


- Generally Adapter is used with factor pattern, when we have multiple implementation of adapters interface to avoid the if-else statement .
- Adapter Pattern allows incompatible interfaces to work together by translating one to another.
- It helps integrate legacy or third-party code while keeping the core domain clean, testable, and closed for modification.
- Open / closed Principal. 

