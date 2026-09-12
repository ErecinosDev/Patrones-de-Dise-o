package org.umg.templatemethod;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected void boilWater() {
        System.out.println("Hirviendo agua.");
    }

    protected abstract void brew();

    protected void pourInCup() {
        System.out.println("Sirviendo en la taza.");
    }

    protected abstract void addCondiments();

    protected boolean customerWantsCondiments() {
        return true;
    }
}
