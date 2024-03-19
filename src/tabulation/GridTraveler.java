package tabulation;

public class GridTraveler {
    public long calculate(int rows, int columns) {
        if(rows == 0 || columns == 0) return 0;
        if(rows == 1 && columns == 1) return 1;
        
        long[][] table = new long[rows + 1][columns + 1];
        table[1][1] = 1;

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= columns; column++) {
                long currentValue = table[row][column];
                if (column + 1 <= columns) table[row][column + 1] += currentValue;
                if (row + 1 <= rows) table[row + 1][column] += currentValue;
            }
        }

        return table[rows][columns];
    }
}
