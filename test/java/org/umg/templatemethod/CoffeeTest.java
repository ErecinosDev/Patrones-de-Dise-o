package org.umg.templatemethod;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class CoffeeTest {

    private Coffee coffee;
    private ByteArrayOutputStream output;
    private PrintStream originalOutput;

    @Before
    public void setUp() {
        coffee = new Coffee();
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
        coffee.prepareRecipe();

        String result = output.toString();
        assertTrue(result.contains("Hirviendo agua."));
        assertTrue(result.contains("Filtrando café molido."));
        assertTrue(result.contains("Sirviendo en la taza."));
        assertTrue(result.contains("Agregando azúcar y leche."));
    }
}
