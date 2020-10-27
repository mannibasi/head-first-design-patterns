package com.design.patterns.factory.factorymethod;

public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            switch (type) {
                case "cheese" -> pizza = new NYStyleCheesePizza();
                case "veggie" -> pizza = new NYStyleVeggiePizza();
                case "clam" -> pizza = new NYStyleClamPizza();
                case "pepperoni" -> pizza = new NYStylePepperoniPizza();
            }
        } else if (style.equals("Chicago")) {
            pizza = switch (type) {
                case "cheese" -> new ChicagoStyleCheesePizza();
                case "veggie" -> new ChicagoStyleVeggiePizza();
                case "clam" -> new ChicagoStyleClamPizza();
                case "pepperoni" -> new ChicagoStylePepperoniPizza();
                default -> pizza;
            };
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
