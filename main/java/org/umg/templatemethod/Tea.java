package org.umg.templatemethod;

public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Remojando la bolsita de té.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Agregando limón.");
    }
}
