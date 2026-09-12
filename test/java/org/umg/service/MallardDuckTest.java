package org.umg.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class MallardDuckTest {

    private MallardDuck mallardDuck;
    private ByteArrayOutputStream output;
    private PrintStream originalOutput;

    @Before
    public void setUp() {
        mallardDuck = new MallardDuck();
        output = new ByteArrayOutputStream();
        originalOutput = System.out;
        System.setOut(new PrintStream(output));
    }

    @After
    public void restoreOutput() {
        System.setOut(originalOutput);
    }

    @Test
    public void testDisplay() {
        mallardDuck.display();

        assertTrue(output.toString().contains("Soy un pato mallard."));
    }

    @Test
    public void testPerformFly() {
        mallardDuck.performFly();

        assertTrue(output.toString().contains("Estoy volando con mis alas."));
    }

    @Test
    public void testSwim() {
        mallardDuck.swim();

        assertTrue(output.toString().contains("Puedo nadar."));
    }

    @Test
    public void testToString() {
        assertTrue(mallardDuck.toString().contains("MallardDuck"));
    }
}
