package tabulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanSumTabulation2Test {

    @Test
    void targetSumOfZeroReturnsTrue() {
        int targetSum = 0;
        int[] numbers = {};

        CanSumTabulation2 canSumTabulation2 = new CanSumTabulation2();

        boolean result = canSumTabulation2.calculate(targetSum, numbers);
        assertTrue(result);
    }

    @Test
    void targetSumOfNegativeReturnsFalse() {
        int targetSum = -1;
        int[] numbers = {};

        CanSumTabulation2 canSumTabulation2 = new CanSumTabulation2();

        boolean result = canSumTabulation2.calculate(targetSum, numbers);
        assertFalse(result);
    }

    @Test
    void calculate7using23returnsTrue() {
        int targetSum = 7;
        int[] numbers = {2, 3};

        CanSumTabulation2 canSumTabulation2 = new CanSumTabulation2();

        boolean result = canSumTabulation2.calculate(targetSum, numbers);
        assertTrue(result);
    }

    @Test
    void calculate7using5347returnsTrue() {
        int targetSum = 7;
        int[] numbers = {5,3,4,7};

        CanSumTabulation2 canSumTabulation2 = new CanSumTabulation2();

        boolean result = canSumTabulation2.calculate(targetSum, numbers);
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void calculate7using24returnsFalse() {
        int targetSum = 7;
        int[] numbers = {2,4};

        CanSumTabulation2 canSumTabulation2 = new CanSumTabulation2();

        boolean result = canSumTabulation2.calculate(targetSum, numbers);
        assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    void calculate8using235returnsTrue() {
        int targetSum = 8;
        int[] numbers = {2,3,5};

        CanSumTabulation2 canSumTabulation2 = new CanSumTabulation2();

        boolean result = canSumTabulation2.calculate(targetSum, numbers);
        assertTrue(result);
    }

    @Test
    void calculate300using714returnsFalse() {
        int targetSum = 300;
        int[] numbers = {7, 14};

        CanSumTabulation2 canSumTabulation2 = new CanSumTabulation2();

        boolean result = canSumTabulation2.calculate(targetSum, numbers);
        assertFalse(result);
    }
}