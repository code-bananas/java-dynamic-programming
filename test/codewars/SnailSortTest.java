package codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.*;

class SnailSortTest {

    @Test
    public void SnailTest1() {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        test(array, r);
    }

    @Test
    public void SnailTest2() {
        int[][] array
                = {{635, 790, 539, 523, 648, 193, 215, 824, 381},
                {96, 406, 562, 135, 213, 904, 388, 948, 454},
                {916, 786, 85, 386, 174, 868, 298, 483, 115},
                {292, 77, 239, 77, 583, 615, 811, 806, 241},
                {542, 980, 635, 601, 532, 917, 176, 861, 766},
                {301, 928, 443, 236, 202, 481, 910, 476, 700},
                {892, 653, 69, 23, 105, 313, 657, 427, 886},
                {607, 565, 840, 628, 591, 409, 301, 265, 117},
                {46, 580, 563, 54, 446, 634, 650, 706, 289}};
        int[] r = {635, 790, 539, 523, 648, 193, 215, 824, 381, 454, 115, 241, 766, 700, 886, 117, 289, 706, 650, 634, 446, 54, 563, 580, 46, 607, 892, 301, 542, 292, 916, 96, 406, 562, 135, 213, 904, 388, 948, 483, 806, 861, 476, 427, 265, 301, 409, 591, 628, 840, 565, 653, 928, 980, 77, 786, 85, 386, 174, 868, 298, 811, 176, 910, 657, 313, 105, 23, 69, 443, 635, 239, 77, 583, 615, 917, 481, 202, 236, 601, 532};
        test(array, r);
    }

    public String int2dToString(int[][] a) {
        return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(joining("\n"));
    }

    public void test(int[][] array, int[] result) {
        String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
        System.out.println(text);
        int[] results = SnailSort.snail(array);
        assertArrayEquals( result, results);
    }

}