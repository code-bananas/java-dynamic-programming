package recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class BestSum {
    HashMap<Integer, ArrayList<Integer>> memo = new HashMap<>();

    public ArrayList<Integer> calculate(int targetSum, int[] numbers) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;

        ArrayList<Integer> shortestCombination = null;

        for (int number : numbers) {
            int remainder = targetSum - number;
            ArrayList<Integer> remainderCombination = calculate(remainder, numbers);
            if (remainderCombination != null) {
                ArrayList<Integer> combination = new ArrayList<>(remainderCombination);
                combination.add(number);
                if (shortestCombination == null || combination.size() < shortestCombination.size()) {
                    shortestCombination = combination;
                }
            }
        }

        memo.put(targetSum, shortestCombination);
        return shortestCombination;
    }
}
