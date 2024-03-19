//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class HowSumTest {
//
//    @org.junit.jupiter.api.Test
//    void targetSumOfZeroReturnsTrue() {
//        int targetSum = 0;
//        int[] numbers = {};
//
//        recursion.HowSum howSum = new recursion.HowSum();
//
//        int[] result = howSum.calculate(targetSum, numbers);
//        assertTrue(result);
//    }
//
//    @org.junit.jupiter.api.Test
//    void targetSumOfNegativeReturnsFalse() {
//        int targetSum = -1;
//        int[] numbers = {};
//
//        recursion.HowSum howSum = new recursion.HowSum();
//
//        int[] result = howSum.calculate(targetSum, numbers);
//        assertFalse(result);
//    }
//
//    @org.junit.jupiter.api.Test
//    void calculate7using23returnsTrue() {
//        int targetSum = 7;
//        int[] numbers = {2, 3};
//
//        recursion.HowSum howSum = new recursion.HowSum();
//
//        int[] result = howSum.calculate(targetSum, numbers);
//        assertTrue(result);
//    }
//
//    @org.junit.jupiter.api.Test
//    void calculate7using5347returnsTrue() {
//        int targetSum = 7;
//        int[] numbers = {5,3,4,7};
//
//        recursion.HowSum howSum = new recursion.HowSum();
//
//        int[] result = howSum.calculate(targetSum, numbers);
//        assertTrue(result);
//    }
//
//    @org.junit.jupiter.api.Test
//    void calculate7using24returnsFalse() {
//        int targetSum = 7;
//        int[] numbers = {2,4};
//
//        recursion.HowSum howSum = new recursion.HowSum();
//
//        int[] result = howSum.calculate(targetSum, numbers);
//        assertFalse(result);
//    }
//
//    @org.junit.jupiter.api.Test
//    void calculate8using235returnsTrue() {
//        int targetSum = 8;
//        int[] numbers = {2,3,5};
//
//        recursion.HowSum howSum = new recursion.HowSum();
//
//        int[] result = howSum.calculate(targetSum, numbers);
//        assertTrue(result);
//    }
//
//    @org.junit.jupiter.api.Test
//    void calculate300using714returnsFalse() {
//        int targetSum = 300;
//        int[] numbers = {7, 14};
//
//        recursion.HowSum howSum = new recursion.HowSum();
//
//        int[] result = howSum.calculate(targetSum, numbers);
//        assertFalse(result);
//    }
//}