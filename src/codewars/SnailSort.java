package codewars;

import java.util.ArrayList;

public class SnailSort {

    public enum Direction {
        minY,
        maxX,
        maxY,
        minX
    }

    public static int[] snail(int[][] array) {
        ArrayList<Integer> results = new ArrayList<>();
        int size = array.length * array[0].length;
        int currentMinY = 0;
        int currentMinX = 0;
        int currentMaxY = array.length - 1;
        int currentMaxX = array[0].length - 1;

        do {

            for (Direction direction : Direction.values()) {

                if (direction == Direction.minY) {
                    for (int i = currentMinX; i <= currentMaxX; i++) {
                        results.add(array[currentMinY][i]);
                    }
                    currentMinY++;
                }
                if (direction == Direction.maxX) {
                    for (int i = currentMinY; i <= currentMaxY; i++) {
                        results.add(array[i][currentMaxX]);
                    }
                    currentMaxX--;
                }
                if (direction == Direction.maxY) {
                    for (int i = currentMaxX; i >= currentMinX; i--) {
                        results.add(array[currentMaxY][i]);
                    }
                    currentMaxY--;
                }
                if (direction == Direction.minX) {
                    for (int i = currentMaxY; i >= currentMinY; i--) {
                        results.add(array[i][currentMinX]);
                    }
                    currentMinX++;
                }
            }

        } while (results.size() < size);

        return results.stream().mapToInt(i -> i).toArray();
    }

}
