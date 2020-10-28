package com.design.patterns.singleton.chocolate;

public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            fillBoilerWithMilkAndChocolateMixture();
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            drainBoiledMilkAndChocolate();
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            bringContentsToBoil();
        }
    }

    private void drainBoiledMilkAndChocolate() {
        empty = true;
    }

    private void fillBoilerWithMilkAndChocolateMixture() {
        empty = false;
        boiled = false;
    }

    private void bringContentsToBoil() {
        boiled = true;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
