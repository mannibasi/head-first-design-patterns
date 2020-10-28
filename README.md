# [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/)
Eric Freeman & Elisabeth Freeman, with Kathy Sierra & Bert Bates

## OO Principles
* Encapsulate what varies
* Favour composition over inheritance
* Program to interfaces, not implementations
* Strive for loosely coupled designs between objects that interact; loosely coupled designs are much more flexible and resilient to change
* Classes should be open for extension, but closed for modification; Open-Closed Principle
* Depend upon abstractions.  Do not depend upon concrete classes

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
