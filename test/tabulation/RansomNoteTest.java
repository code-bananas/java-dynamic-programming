package tabulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @Test
    void canConstructAfromB() {
        RansomNote ransomNote = new RansomNote();

        boolean result = ransomNote.canConstruct("a", "b");

        assertFalse(result);
    }

    @Test
    void canConstructAAfromAB() {
        RansomNote ransomNote = new RansomNote();

        boolean result = ransomNote.canConstruct("aa", "ab");

        assertFalse(result);
    }

    @Test
    void canConstructAAfromAAB() {
        RansomNote ransomNote = new RansomNote();

        boolean result = ransomNote.canConstruct("aa", "aab");

        assertTrue(result);
    }
}