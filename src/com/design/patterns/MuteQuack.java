package com.design.patterns;

public class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
