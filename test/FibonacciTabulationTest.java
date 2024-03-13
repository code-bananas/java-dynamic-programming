import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTabulationTest {
        @Test
        void calculateFibonacciResultForOneWillBeOne() {
            FibonacciTabulation fibonacciTabulation = new FibonacciTabulation();

            long result = fibonacciTabulation.calculate(1);

            Assertions.assertEquals(1, result);
        }

        @Test
        void calculateFibonacciResultForThreeWillBeTwo() {
            FibonacciTabulation fibonacciTabulation = new FibonacciTabulation();

            long result = fibonacciTabulation.calculate(3);

            Assertions.assertEquals(2l, result);
        }

        @Test
        void calculateFibonacciResultForSevenWillBeThirteen() {
            FibonacciTabulation fibonacciTabulation = new FibonacciTabulation();

            long result = fibonacciTabulation.calculate(7);

            Assertions.assertEquals(13l, result);
        }

        @Test
        void calculateFibonacciResultForTwentyWillBe6765() {
            FibonacciTabulation fibonacciTabulation = new FibonacciTabulation();

            long result = fibonacciTabulation.calculate(20);

            Assertions.assertEquals(6765L, result);
        }

        @Test //22 seconds
        void calculateFibonacciResultForFiftyWillBe12586269025() {
            FibonacciTabulation fibonacciTabulation = new FibonacciTabulation();

            long result = fibonacciTabulation.calculate(50);

            Assertions.assertEquals(12586269025L, result);
        }
    }