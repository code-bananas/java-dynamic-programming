import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class NewHashmapTest {

    @Test
    void solutionA() {
        String[] queryType = {"insert", "insert", "addToValue", "addToKey", "get"};
        int[][] query = {{1, 2}, {2, 3}, {2}, {1}, {3}};

        NewHashmap newHashmap = new NewHashmap();

        long results = newHashmap.solution(queryType,query);

        assertEquals(5, results);
    }

    @Test
    void solutionB() {
        String[] queryType = {"insert", "addToValue", "get", "insert", "addToKey", "addToValue", "get"};
        int[][] query = {{1, 2}, {2}, {1}, {2, 3}, {1}, {-1}, {3}};

        NewHashmap newHashmap = new NewHashmap();

        long results = newHashmap.solution(queryType,query);

        assertEquals(6, results);
    }

    @Test
    void insert() {
        NewHashmap newHashmap = new NewHashmap();
        newHashmap.insert(1,2);

        HashMap<Integer, Integer> results = newHashmap.getData();
        assertEquals(2, results.get(1));
    }

    @Test
    void get() {
        NewHashmap newHashmap = new NewHashmap();
        newHashmap.insert(4,5);

        Integer results = newHashmap.get(4);
        assertEquals(5, results);
    }

    @Test
    void addToKeys() {
        NewHashmap newHashmap = new NewHashmap();
        newHashmap.insert(6,7);

        newHashmap.addToKeys(1);

        Integer results = newHashmap.get(7);
        assertEquals(7, results);
    }

    @Test
    void addToValues() {
        NewHashmap newHashmap = new NewHashmap();
        newHashmap.insert(9,9);

        newHashmap.addToValues(1);

        Integer results = newHashmap.get(9);
        assertEquals(10, results);
    }

    @Test
    void getData() {
        NewHashmap newHashmap = new NewHashmap();
        HashMap<Integer, Integer> results = newHashmap.getData();

        assertEquals(HashMap.class, results.getClass());
    }
}