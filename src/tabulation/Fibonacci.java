package tabulation;

public class Fibonacci {

    public long calculate(int sequence) {
        if (sequence == 1) return 1;
        long[] tab = new long[sequence + 1];
        tab[1] = 1;

        for (int i = 0; i < tab.length; i++) {
            if (i + 1 < tab.length) tab[i + 1] += tab[i];
            if (i + 2 < tab.length) tab[i + 2] += tab[i];
        }

        return tab[sequence];
    }

}
