package aaagt.structural.binaryfacade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinOpsTest {

    @Test
    void sum() {
        // given
        BinOps bins = new BinOps();
        String a = "10110"; // 22
        String b = "1010"; // 10
        String expected = "100000"; // 32

        // when
        String actual = bins.sum(a, b);

        // then
        assertEquals(expected, actual);
    }

    @Test
    void mult() {
        // given
        BinOps bins = new BinOps();
        String a = "10"; // 2
        String b = "1010"; // 10
        String expected = "10100"; // 20

        // when
        String actual = bins.mult(a, b);

        // then
        assertEquals(expected, actual);
    }
}
