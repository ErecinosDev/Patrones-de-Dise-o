package org.umg.service;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Duck {

    protected FlyBehavior fb;

    public void swim() {
        System.out.println("Puedo nadar.");
    }


    public void setFB(FlyBehavior fb) {
        this.fb = fb;
    }

    public void performFly() {
        fb.fly();
    }

    public abstract void display();

    @Override
    public abstract String toString();
}
