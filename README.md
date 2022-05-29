# [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/)
_Eric Freeman & Elisabeth Freeman, with Kathy Sierra & Bert Bates_

Studying patterns based on book Head First Design Patterns 2nd Edition ([book included in the resources folder](recources/freeman_eric_robson_elisabeth_head_first_design_patterns_bui.pdf))


## OO Principles
* Encapsulate what varies
* Delegation. Favor composition over inheritance
* Program to interfaces, not implementations
* Strive for loosely coupled designs between objects that interact; loosely coupled designs are much more flexible and resilient to change
* SOLID principles:  
    - **S**ingle Responsibility principle  
      - one class, one responsibiliy
      - look up to the class name to know what to contain
      - don’t make printer inside of the class
    - **O**pen close principle
      - class should be open to extension
      - class should be closed to modifications
    
          <aside>
          ❗ code to interface
    
    </aside>
    
  - **L**iskov substitution principle
    
     - Every children class (subclass or derived class) must be able to substitute the base or parent class. 
    
  - **I**nterface segregation principle
    
     - Classes that implement interface should not implement useless methods from an interface; meaning interfaces should not force classes implement what they cannot do. If I want to add a method to interface but it implemented class would not use it, it is better to create a new interface with this method
    
  - **D**ependency inversion principle
    
     - High-level and low-level modules should depend upon abstractions; not on the details
    - Abstractions should never depend upon details. Details should depend upon abstractions.
    - [Code tom interface vs Dependency inversion principle](https://softwareengineering.stackexchange.com/questions/234747/dependency-inversion-principle-vs-program-to-an-interface-not-an-implementatio)
        
        ```csharp
        //best practice
        public class ThingProcessor
        {
            IMyThing _myThing;
        
            public ThingProcessor(IMyThing myThing) // using an interface
            {
                _myThing = myThing;
            }
        
            public void DoSomething()
            {
                _myThing.DoIt();
            }
        }
        ``` 
- YAGNI principle
    
    *you aren’t gonna need it*
    
    - basically, code only what is ordered by a customer, never what i foresee
- KISS principle
    
    *keep it simple stupid*
    
    - perfection is when there is nothing more to simplify
- DRY principle
    
    *don’t repeat yourself*
    
---
* Depend upon abstractions.  Do not depend upon concrete classes


* Only talk to your friends.  Principle of Least Knowledge (aka Law of Demeter); talk only to your immediate friends
* Don't call us, we'll call you!
* A class should have only one reason to change

# [The Strategy Pattern](https://github.com/realtehcman/DesignPatternsEricFreeman/blob/master/1strategy)

|pattern | categories | tags|
|------  |---------   |--------|
|Strategy| Bahavioral | Gang of Four|


## Also known as

Policy

## Intent

Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets 
the algorithm vary independently from the clients that use it.

## Explanation

Real-world example

> Slaying dragons is a dangerous job. With experience, it becomes easier. Veteran 
> dragonslayers have developed different fighting strategies against different types of dragons.         

In plain words

> Strategy pattern allows choosing the best-suited algorithm at runtime.   

Wikipedia says

> In computer programming, the strategy pattern (also known as the policy pattern) is a behavioral 
> software design pattern that enables selecting an algorithm at runtime.

### Quick Overview
    
- prefer HAS-A over IS-A relationship
- extract algorithms (behaviors, interfaces) and put them into fields (has a relationship)
    
    *this way we*
    
    - interface is basically a place holder to be implemented by an concrete method from a class
    - we reuse some algorithms
    - we solve problem with the code duplication that happens with inheritance
            
- perform dependency injection
        
    - it dynamically sets the implementation of those algorithms

# [The Observer Pattern](https://github.com/realtehcman/DesignPatternsEricFreeman/blob/master/2observer/weather_station)
Defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

### Quick Overview
- glossary
    - in the book they actively use “subject”, yet, in my examples I use observable for the clearer understanding. “Observable” is observed by an “Observer”
- when to use
    - subscriptions
    - notify listeners on updates
- one to many relationships
    - observable can have many observers
- observers may be also observables
- objects in the pattern
    - Observable; gets changes and notifies an observer
    - Observer; pulls changes when notified
- we implement the push pull behavior. Observable pushes, and observer pulls the changes  
    - IObservable has couple methods: add(), remove(), notify(),
    - Observable : IObservable has getTemparature() and other additional methods, and has ***IObserver*** object  
    
    - IObserver has update method
    - Observer : IObserver and has ***Observable*** object
        - what if we want to implement the push push behavior. 
            - Observable notifies and pushes update, and observer has update(Observable object) method

# The Decorator Pattern
Attaches additional responsibilities to an object dynamically.  Decorators provide a flexible alternative to sub-classing for extending functionality.

# The Factory Pattern
## The Factory Method Pattern
Defines an interface for creating an object, but lets sub-classes decide which class to instantiate.  Factory Method lets a class defer instantiation to sub-classes.
### The Abstract Factory Pattern
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
> Both of these patterns encapsulate object creation and lead to more decoupled, flexible designs.

# The Singleton Pattern
Ensures a class has only one instance, and provides a global point of access to it.

# The Command Pattern
Encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.

# The Adapter Pattern
Converts the interface of a class into another interface the client expects.  Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

# The Facade Pattern
Provides a unified interface to a set of interfaces in a subsystem.  Facade defines a higher-level interface that makes the subsystem easier to use.

# The Template Method Pattern
Defines the skeleton of an algorithm in an operation, deferring some steps to subclasses.
Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

# The Iterator Pattern
Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

# The Composite Pattern
Composes objects into tree structures to represent part-whole hierarchies.  Composite lets clients treat individual objects and compositions of objects uniformly.

# The State Pattern
Allows an object to alter its behaviour when its internal state changes.  The object will appear to change its class.
