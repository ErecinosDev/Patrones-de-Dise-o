package org.umg.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class FlyWithWingsTest {

    private FlyWithWings flyWithWings;
    private ByteArrayOutputStream output;
    private PrintStream originalOutput;

    @Before
    public void setUp() {
        flyWithWings = new FlyWithWings();
        output = new ByteArrayOutputStream();
        originalOutput = System.out;
        System.setOut(new PrintStream(output));
    }

    @After
    public void restoreOutput() {
        System.setOut(originalOutput);
    }

    @Test
    public void testFly() {
        flyWithWings.fly();

        assertTrue(output.toString().contains("Estoy volando con mis alas."));
    }

    @Test
    public void testToString() {
        assertTrue(flyWithWings.toString().contains("Vuelo con alas"));
    }
}
