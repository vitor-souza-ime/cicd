package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTestTest {

    @Test
    public void testSoma()
    {
        CalculadoraTest calc=new CalculadoraTest();
        assertEquals(5,calc.soma(3,2));
    }

    @Test
    public void testSubt()
    {
        CalculadoraTest calc=new CalculadoraTest();
        assertEquals(1,calc.subtrai(3,2));
    }

}