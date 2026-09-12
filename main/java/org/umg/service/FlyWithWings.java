package org.umg.service;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Estoy volando con mis alas.");
    }

    @Override
    public String toString() {
        return "Vuelo con alas";
    }
}
