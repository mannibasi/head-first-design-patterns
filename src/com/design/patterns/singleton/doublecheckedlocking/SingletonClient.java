package com.design.patterns.singleton.doublecheckedlocking;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
