package com.design.patterns.factory.factorymethod;

public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> null;
        };
    }
}
