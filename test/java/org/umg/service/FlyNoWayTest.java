package org.umg.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class FlyNoWayTest {

    private FlyNoWay flyNoWay;
    private ByteArrayOutputStream output;
    private PrintStream originalOutput;

    @Before
    public void setUp() {
        flyNoWay = new FlyNoWay();
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
        flyNoWay.fly();

        assertTrue(output.toString().contains("No puedo volar."));
    }

    @Test
    public void testToString() {
        assertTrue(flyNoWay.toString().contains("No vuela"));
    }
}
