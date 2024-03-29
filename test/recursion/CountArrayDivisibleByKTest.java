package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountArrayDivisibleByKTest {

    @Test
    void countPairs12345b2() {

        CountArrayDivisibleByK countArrayDivisibleByK = new CountArrayDivisibleByK();
        int[] nums = {1, 2, 3, 4, 5};

        long result = countArrayDivisibleByK.countPairs(nums, 2);

        assertEquals(7, result);

    }

    @Test
    void countPairs1234b5() {

        CountArrayDivisibleByK countArrayDivisibleByK = new CountArrayDivisibleByK();
        int[] nums = {1, 2, 3, 4};

        long result = countArrayDivisibleByK.countPairs(nums, 5);

        assertEquals(0, result);

    }
}