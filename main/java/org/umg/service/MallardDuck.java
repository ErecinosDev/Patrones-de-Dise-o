package org.umg.service;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("Soy un pato mallard.");
    }

    @Override
    public String toString() {
        return "MallardDuck";
    }
}
