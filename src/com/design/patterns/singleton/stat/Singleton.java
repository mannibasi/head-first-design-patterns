package com.design.patterns.singleton.stat;

public class Singleton {
    private static final Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
