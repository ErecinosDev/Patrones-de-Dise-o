package org.umg.service;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Duck {

    protected final FlyBehavior fb;

    public void swim() {
        System.out.println("Puedo nadar.");
    }


    public void performFly()
    {
        fb.fly();
    }

    public abstract void display();

    @Override
    public abstract String toString();
}
