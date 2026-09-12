package org.umg.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class RubberDuckTest {

    private RubberDuck rubberDuck;
    private ByteArrayOutputStream output;
    private PrintStream originalOutput;

    @Before
    public void setUp() {
        rubberDuck = new RubberDuck();
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
        rubberDuck.display();

        assertTrue(output.toString().contains("Soy un pato de goma."));
    }

    @Test
    public void testPerformFly() {
        rubberDuck.performFly();

        assertTrue(output.toString().contains("No puedo volar."));
    }

    @Test
    public void testSwim() {
        rubberDuck.swim();

        assertTrue(output.toString().contains("Puedo nadar."));
    }

    @Test
    public void testToString() {
        assertTrue(rubberDuck.toString().contains("RubberDuck"));
    }
}
