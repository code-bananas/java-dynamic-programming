import java.util.HashMap;

public class Fibonacci {
    HashMap<Integer, Long> memo = new HashMap<Integer, Long>();

    public long calculate(int sequence) {
        if(memo.containsKey(sequence) == false){
            if (sequence <= 2) return 1;
            memo.put(sequence, this.calculate(sequence - 1) + this.calculate(sequence - 2));
        }
        return memo.get(sequence);
    }

}
