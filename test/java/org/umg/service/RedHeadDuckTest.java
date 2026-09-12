package org.umg.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class RedHeadDuckTest {

    private RedHeadDuck redHeadDuck;
    private ByteArrayOutputStream output;
    private PrintStream originalOutput;

    @Before
    public void setUp() {
        redHeadDuck = new RedHeadDuck();
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
        redHeadDuck.display();

        assertTrue(output.toString().contains("Soy un pato de cabeza roja."));
    }

    @Test
    public void testPerformFly() {
        redHeadDuck.performFly();

        assertTrue(output.toString().contains("Estoy volando con mis alas."));
    }

    @Test
    public void testSwim() {
        redHeadDuck.swim();

        assertTrue(output.toString().contains("Puedo nadar."));
    }

    @Test
    public void testToString() {
        assertTrue(redHeadDuck.toString().contains("RedHeadDuck"));
    }
}
