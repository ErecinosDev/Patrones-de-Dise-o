package org.umg.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class DecoyDuckTest {

    private DecoyDuck decoyDuck;
    private ByteArrayOutputStream output;
    private PrintStream originalOutput;

    @Before
    public void setUp() {
        decoyDuck = new DecoyDuck();
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
        decoyDuck.display();

        assertTrue(output.toString().contains("Soy un pato señuelo."));
    }

    @Test
    public void testPerformFly() {
        decoyDuck.performFly();

        assertTrue(output.toString().contains("No puedo volar."));
    }

    @Test
    public void testSwim() {
        decoyDuck.swim();

        assertTrue(output.toString().contains("Puedo nadar."));
    }

    @Test
    public void testToString() {
        assertTrue(decoyDuck.toString().contains("DecoyDuck"));
    }
}
