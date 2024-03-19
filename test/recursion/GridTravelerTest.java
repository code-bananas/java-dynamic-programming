package recursion;

import recursion.GridTraveler;

import static org.junit.jupiter.api.Assertions.*;

class GridTravelerTest {

    @org.junit.jupiter.api.Test
    void calculate0or0returns0() {
        GridTraveler gridTraveler = new GridTraveler();

        long results = gridTraveler.calculate(0,0);
        assertEquals(0, results);

        results = gridTraveler.calculate(1,0);
        assertEquals(0, results);

        results = gridTraveler.calculate(0,1);
        assertEquals(0, results);
    }

    @org.junit.jupiter.api.Test
    void calculate1and1returns1() {
        GridTraveler gridTraveler = new GridTraveler();

        long results = gridTraveler.calculate(1,1);
        assertEquals(1, results);
    }

    @org.junit.jupiter.api.Test
    void calculate2and3returns3() {
        GridTraveler gridTraveler = new GridTraveler();

        long results = gridTraveler.calculate(2,3);
        assertEquals(3, results);
    }

    @org.junit.jupiter.api.Test
    void calculate3and2returns3() {
        GridTraveler gridTraveler = new GridTraveler();

        long results = gridTraveler.calculate(3,2);
        assertEquals(3, results);
    }

    @org.junit.jupiter.api.Test
    void calculate3and3returns3() {
        GridTraveler gridTraveler = new GridTraveler();

        long results = gridTraveler.calculate(3,3);
        assertEquals(6, results);
    }

    @org.junit.jupiter.api.Test // 16 seconds
    void calculate18and18returns2333606220() {
        GridTraveler gridTraveler = new GridTraveler();

        long results = gridTraveler.calculate(18,18);
        assertEquals(2333606220l, results);
    }
}