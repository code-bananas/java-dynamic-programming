package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStepsToZeroTest {

    @Test
    void numberOfSteps14Is6() {
        NumberOfStepsToZero numberOfStepsToZero = new NumberOfStepsToZero();

        int results = numberOfStepsToZero.numberOfSteps(14);

        assertEquals(6, results);
    }

    @Test
    void numberOfSteps8Is4() {
        NumberOfStepsToZero numberOfStepsToZero = new NumberOfStepsToZero();

        int results = numberOfStepsToZero.numberOfSteps(8);

        assertEquals(4, results);
    }
}