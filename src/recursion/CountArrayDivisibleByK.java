package recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountArrayDivisibleByK {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long countPairs(int[] nums, int k) {
        long count = 0;
        Map<Integer, Integer> factorCount = new HashMap<>();

        for (int num : nums) {
            int gcdValue = gcd(num, k);
            for (Map.Entry<Integer, Integer> entry : factorCount.entrySet()) {
                if ((long) gcdValue * entry.getKey() % k == 0) {
                    count += entry.getValue();
                }
            }
            factorCount.put(gcdValue, factorCount.getOrDefault(gcdValue, 0) + 1);
        }

        return count;
    }
}
