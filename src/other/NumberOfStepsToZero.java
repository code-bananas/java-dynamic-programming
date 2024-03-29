package other;

public class NumberOfStepsToZero {
    public int numberOfSteps(int num) {
        int remainder = num;
        int counter = 0;

        while (remainder > 0) {
            counter++;

            if (remainder % 2 == 0) {
                remainder /= 2;
            } else {
                remainder--;
            }
        }

        return counter;
    }
}
