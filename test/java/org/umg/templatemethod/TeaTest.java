package org.umg.templatemethod;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class TeaTest {

    private Tea tea;
    private ByteArrayOutputStream output;
    private PrintStream originalOutput;

    @Before
    public void setUp() {
        tea = new Tea();
        output = new ByteArrayOutputStream();
        originalOutput = System.out;
        System.setOut(new PrintStream(output));
    }

    @After
    public void restoreOutput() {
        System.setOut(originalOutput);
    }

    @Test
    public void testPrepareRecipe() {
        tea.prepareRecipe();

        String result = output.toString();
        assertTrue(result.contains("Hirviendo agua."));
        assertTrue(result.contains("Remojando la bolsita de té."));
        assertTrue(result.contains("Sirviendo en la taza."));
        assertTrue(result.contains("Agregando limón."));
    }
}
