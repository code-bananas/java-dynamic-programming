package recursion;

import java.util.HashMap;

public class GridTraveler {
    HashMap<String, Long> memo = new HashMap<>();

    public long calculate(int rows, int columns) {
        String memoKey = rows + "," + columns;
        if(this.memo.containsKey(memoKey)) return this.memo.get(memoKey);

        if(rows == 0 || columns == 0) return 0;
        if(rows == 1 && columns == 1) return 1;

        this.memo.put(memoKey, calculate(rows - 1, columns) + calculate(rows, columns - 1));
        return this.memo.get(memoKey);
    }

}
