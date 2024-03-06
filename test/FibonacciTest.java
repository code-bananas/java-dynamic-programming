import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void calculateFibonacciResultForOneWillBeOne() {
        Fibonacci fibonacci = new Fibonacci();

        long result = fibonacci.calculate(1);

        Assertions.assertEquals(1, result);
    }

    @Test
    void calculateFibonacciResultForThreeWillBeTwo() {
        Fibonacci fibonacci = new Fibonacci();

        long result = fibonacci.calculate(3);

        Assertions.assertEquals(2l, result);
    }

    @Test
    void calculateFibonacciResultForSevenWillBeThirteen() {
        Fibonacci fibonacci = new Fibonacci();

        long result = fibonacci.calculate(7);

        Assertions.assertEquals(13l, result);
    }

    @Test
    void calculateFibonacciResultForTwentyWillBe6765() {
        Fibonacci fibonacci = new Fibonacci();

        long result = fibonacci.calculate(20);

        Assertions.assertEquals(6765l, result);
    }

    @Test //22 seconds
    void calculateFibonacciResultForFiftyWillBe12586269025() {
        Fibonacci fibonacci = new Fibonacci();

        long result = fibonacci.calculate(50);

        Assertions.assertEquals(12586269025l, result);
    }
}