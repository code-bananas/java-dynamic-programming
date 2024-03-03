import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitSwapTest {

    @Test
    void calculate1n5n10n20eTrue() {
        DigitSwap digitSwap = new DigitSwap();
        int[] testNumbers = {1,5,10,20};

        boolean result = digitSwap.calculate(testNumbers);

        assertTrue(result);
    }

    @Test
    void calculate1e3e900e10eTrue() {
        DigitSwap digitSwap = new DigitSwap();
        int[] testNumbers = {1,3,900,10};

        boolean result = digitSwap.calculate(testNumbers);

        assertTrue(result);
    }

    @Test
    void calculate13n31n30efalse() {
        DigitSwap digitSwap = new DigitSwap();
        int[] testNumbers = {13,31,30};

        boolean result = digitSwap.calculate(testNumbers);

        assertFalse(result);
    }
}