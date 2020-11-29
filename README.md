# [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/)
Eric Freeman & Elisabeth Freeman, with Kathy Sierra & Bert Bates

## OO Principles
* Encapsulate what varies
* Favour composition over inheritance
* Program to interfaces, not implementations
* Strive for loosely coupled designs between objects that interact; loosely coupled designs are much more flexible and resilient to change
* Classes should be open for extension, but closed for modification; Open-Closed Principle
* Depend upon abstractions.  Do not depend upon concrete classes
* Only talk to your friends.  Principle of Least Knowledge (aka Law of Demeter); talk only to your immediate friends
* Don't call us, we'll call you!
* A class should have only one reason to change

## The Strategy Pattern
Defines a family of algorithms, encapsulates each one, and makes them interchangeable.  Strategy lets the algorithm vary independently from client that use it.

## The Observer Pattern
Defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

## The Decorator Pattern
Attaches additional responsibilities to an object dynamically.  Decorators provide a flexible alternative to sub-classing for extending functionality.

## The Factory Pattern
### The Factory Method Pattern
Defines an interface for creating an object, but lets sub-classes decide which class to instantiate.  Factory Method lets a class defer instantiation to sub-classes.
### The Abstract Factory Pattern
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
> Both of these patterns encapsulate object creation and lead to more decoupled, flexible designs.

## The Singleton Pattern
Ensures a class has only one instance, and provides a global point of access to it.

## The Command Pattern
Encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.

## The Adapter Pattern
Converts the interface of a class into another interface the client expects.  Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

## The Facade Pattern
Provides a unified interface to a set of interfaces in a subsystem.  Facade defines a higher-level interface that makes the subsystem easier to use.

## The Template Method Pattern
Defines the skeleton of an algorithm in an operation, deferring some steps to subclasses.
Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## The Iterator Pattern
Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

## The Composite Pattern
Composes objects into tree structures to represent part-whole hierarchies.  Composite lets clients treat individual objects and compositions of objects uniformly.