package com.design.patterns.strategy;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
