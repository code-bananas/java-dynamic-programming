package other;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results.add("FizzBuzz");
            } else if (i % 3 == 0) {
                results.add("Fizz");
            } else if (i % 5 == 0) {
                results.add("Buzz");
            } else {
                results.add(String.valueOf(i));
            }
        }

        return results;
    }
}
