package org.umg.service;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No puedo volar.");
    }

    @Override
    public String toString() {
        return "No vuela";
    }
}
