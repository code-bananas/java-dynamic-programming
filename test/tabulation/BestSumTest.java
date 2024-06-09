package tabulation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BestSumTest {

    @Test
    void bestSumOfTarget7using5347is7() {
        int targetSum = 7;
        int[] numbers = {5,3,4,7};

        BestSum bestSum = new BestSum();

        ArrayList<Integer> result = bestSum.calculate(targetSum, numbers);
        assertEquals("[7]", result.toString());
    }

    @Test
    void bestSumOfTarget8using235is35() {
        int targetSum = 8;
        int[] numbers = {2,3,5};

        BestSum bestSum = new BestSum();

        ArrayList<Integer> result = bestSum.calculate(targetSum, numbers);
        assertEquals("[5, 3]", result.toString());
    }

    @Test
    void bestSumOfTarget8using145is44() {
        int targetSum = 8;
        int[] numbers = {1, 4, 5};

        BestSum bestSum = new BestSum();

        ArrayList<Integer> result = bestSum.calculate(targetSum, numbers);
        assertEquals("[4, 4]", result.toString());
    }

    @Test
    void bestSumOfTarget100using12525is25252525() {
        int targetSum = 100;
        int[] numbers = {1, 2, 5, 25};

        BestSum bestSum = new BestSum();

        ArrayList<Integer> result = bestSum.calculate(targetSum, numbers);
        assertEquals("[25, 25, 25, 25]", result.toString());
    }
}