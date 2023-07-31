package aaagt.structural.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntsCalculatorTest {

    @Test
    void sum() {
        // given
        Ints intsCalc = new IntsCalculator();
        int arg0 = 7;
        int arg1 = 11;
        int expected = 18;

        // when
        int actual = intsCalc.sum(arg0, arg1);

        // then
        assertEquals(expected, actual);
    }

    @Test
    void mult() {
        // given
        Ints intsCalc = new IntsCalculator();
        int arg0 = 7;
        int arg1 = 11;
        int expected = 77;

        // when
        int actual = intsCalc.mult(arg0, arg1);

        // then
        assertEquals(expected, actual);
    }

    @Test
    void pow() {
        // given
        Ints intsCalc = new IntsCalculator();
        int a = 7;
        int b = 11;
        int expected = 1977326743;

        // when
        int actual = intsCalc.pow(a, b);

        // then
        assertEquals(expected, actual);
    }
}
