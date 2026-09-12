package org.umg;

import org.umg.service.Duck;
import org.umg.service.MallardDuck;
import org.umg.service.RedHeadDuck;
import org.umg.service.RubberDuck;

public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {new RedHeadDuck(), new MallardDuck(), new RubberDuck()};

        for (Duck duck : ducks) {
            System.out.println(duck);
            duck.display();
            duck.swim();
            duck.performFly();
            System.out.println();
        }
    }
}
