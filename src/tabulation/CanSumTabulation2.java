package tabulation;

public class CanSumTabulation2 {

    public boolean calculate(int targetSum, int[] numbers) {
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;
        boolean[] table = new boolean[targetSum + 1];
        table[0] = true;

        for (int i = 0; i < table.length; i++) {
            if (table[i] == true) {
                for (int number : numbers) {
                    if (i + number < table.length) table[i + number] = true;
                }
            }
        }

        return table[targetSum];
    }

}
