package org.umg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class MainTest {

    private ByteArrayOutputStream output;
    private PrintStream originalOutput;

    @Before
    public void setUp() {
        output = new ByteArrayOutputStream();
        originalOutput = System.out;
        System.setOut(new PrintStream(output));
    }

    @After
    public void restoreOutput() {
        System.setOut(originalOutput);
    }

    @Test
    public void testMain() {
        Main.main(new String[]{});

        assertTrue(output.toString().contains("RedHeadDuck"));
        assertTrue(output.toString().contains("MallardDuck"));
        assertTrue(output.toString().contains("RubberDuck"));
    }
}
