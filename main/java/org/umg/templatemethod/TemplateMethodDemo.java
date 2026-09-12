package org.umg.templatemethod;

public class TemplateMethodDemo {

    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        System.out.println("Preparando café:");
        coffee.prepareRecipe();

        System.out.println();
        System.out.println("Preparando té:");
        tea.prepareRecipe();
    }
}
