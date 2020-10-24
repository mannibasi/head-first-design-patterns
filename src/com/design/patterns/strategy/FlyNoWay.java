package com.design.patterns.strategy;

public class FlyNoWay implements FlyBehaviour {
    public void fly() {
        System.out.println("I can't fly");
    }
}
