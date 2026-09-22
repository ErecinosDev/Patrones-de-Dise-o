package org.umg.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class DuckTest {

    private Duck duck;
    private ByteArrayOutputStream output;
    private PrintStream originalOutput;

    @Before
    public void setUp() {
        duck = new Duck(new FlyNoWay()) {
            @Override
            public void display() {
                System.out.println("Soy un pato de prueba.");
            }

            @Override
            public String toString() {
                return "Duck de prueba";
            }
        };

        output = new ByteArrayOutputStream();
        originalOutput = System.out;
        System.setOut(new PrintStream(output));
    }

    @After
    public void restoreOutput() {
        System.setOut(originalOutput);
    }

    @Test
    public void testSwim() {
        duck.swim();

        assertTrue(output.toString().contains("Puedo nadar"));
    }

    @Test
    public void testPerformFly() {
        duck.performFly();

        assertTrue(output.toString().contains("No puedo volar."));
    }

    @Test
    public void testSetFB() {
        duck.setFB(new FlyWithWings());
        duck.performFly();

        assertTrue(output.toString().contains("Estoy volando con mis alas."));
    }

    @Test
    public void testDisplay() {
        duck.display();

        assertTrue(output.toString().contains("Soy un pato de prueba."));
    }

    @Test
    public void testToString() {
        assertTrue(duck.toString().contains("Duck de prueba"));
    }
}
