package com.engeto.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalcTest {

    @Test
    @DisplayName("Test souctu dvoch cisel.")
    public void testScitani() {
        int actual = Calc.scitani(2, 3);
        int expect = 5;
        Assertions.assertEquals(expect, actual);
    }

    @Test
    @DisplayName("Test rozdilu dvoch cisel.")
    void rozdil() {
        int actual = Calc.rozdil(5, 3);
        int expect = 2;
        Assertions.assertEquals(expect, actual);
    }

    @Test
    @DisplayName("Test nerovnosti dvoch cisel.")
    public void testScitaniBiggerThenZero() {
        int actual = Calc.scitani(2, 3);
        Assertions.assertNotEquals(actual, 0);
    }

    @Test
    @DisplayName("Test delenie nulou.")
    public void testDelenieNulou() {
        Exception expect = Assertions.assertThrows(ArithmeticException.class,
                () -> Calc.deleni(12, 0));
        Assertions.assertEquals("/ by zero", expect.getMessage());

    }

    @Test
    @DisplayName("Test nasobenie dvoch cisel.")
    public void nasobeni() {
        int actual = Calc.nasobeni(2, 3);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }
}
