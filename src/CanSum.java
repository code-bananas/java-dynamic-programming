import java.util.HashMap;

public class CanSum {
    HashMap<Integer, Boolean> memo = new HashMap<>();

    public boolean calculate(int targetSum, int[] numbers) {
        if(memo.containsKey(targetSum)) return memo.get(targetSum);
        if(targetSum == 0) return true;
        if(targetSum < 0) return false;

        for(int number : numbers){
            boolean result = calculate(targetSum - number, numbers);

            memo.put(targetSum - number, result);
            if(result == true) return true;
        }

        return false;
    }

}
