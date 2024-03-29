package other;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        List<String> result = fizzBuzz.fizzBuzz(3);

        assertEquals("1", result.get(0));
        assertEquals("2", result.get(1));
        assertEquals("Fizz", result.get(2));
    }

    @Test
    void fizzBuzz5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        List<String> result = fizzBuzz.fizzBuzz(5);

        assertEquals("1", result.get(0));
        assertEquals("2", result.get(1));
        assertEquals("Fizz", result.get(2));
        assertEquals("4", result.get(3));
        assertEquals("Buzz", result.get(4));
    }
}