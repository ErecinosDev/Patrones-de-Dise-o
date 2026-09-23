package org.umg.service;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("Soy un pato señuelo.");
    }

    @Override
    public String toString() {
        return "DecoyDuck";
    }
}
