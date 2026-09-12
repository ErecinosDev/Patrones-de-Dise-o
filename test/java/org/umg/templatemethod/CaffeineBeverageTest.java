package org.umg.templatemethod;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CaffeineBeverageTest {

    private CaffeineBeverage beverage;
    private ByteArrayOutputStream output;
    private PrintStream originalOutput;

    @Before
    public void setUp() {
        beverage = new CaffeineBeverage() {
            @Override
            protected void brew() {
                System.out.println("Preparando bebida de prueba.");
            }

            @Override
            protected void addCondiments() {
                System.out.println("Agregando condimento de prueba.");
            }

            @Override
            protected boolean customerWantsCondiments() {
                return false;
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
    public void testPrepareRecipeUsesTheDefinedOrder() {
        beverage.prepareRecipe();

        String result = output.toString();
        assertTrue(result.indexOf("Hirviendo agua.") < result.indexOf("Preparando bebida de prueba."));
        assertTrue(result.indexOf("Preparando bebida de prueba.") < result.indexOf("Sirviendo en la taza."));
    }

    @Test
    public void testHookCanAvoidCondiments() {
        beverage.prepareRecipe();

        assertFalse(output.toString().contains("Agregando condimento de prueba."));
    }
}
