package org.umg.service;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("Soy un pato de goma.");
    }

    @Override
    public String toString() {
        return "RubberDuck";
    }
}
