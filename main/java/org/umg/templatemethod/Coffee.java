package org.umg.templatemethod;

public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Filtrando café molido.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Agregando azúcar y leche.");
    }
}
