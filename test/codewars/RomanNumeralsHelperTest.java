package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsHelperTest {

    @Test
    void toRoman1() {
        String result = RomanNumeralsHelper.toRoman(1);
        assertEquals("I", result);
    }

    @Test
    void toRoman2() {
        String result = RomanNumeralsHelper.toRoman(2);
        assertEquals("II", result);
    }

    @Test
    void toRoman2000() {
        String result = RomanNumeralsHelper.toRoman(2000);
        assertEquals("MM", result);
    }

    @Test
    void toRoman9() {
        String result = RomanNumeralsHelper.toRoman(9);
        assertEquals("IX", result);
    }

    @Test
    void toRoman1666() {
        String result = RomanNumeralsHelper.toRoman(1666);
        assertEquals("MDCLXVI", result);
    }

    @Test
    void toRoman86() {
        String result = RomanNumeralsHelper.toRoman(86);
        assertEquals("LXXXVI", result);
    }

    @Test
    void toRoman92() {
        String result = RomanNumeralsHelper.toRoman(92);
        assertEquals("XCII", result);
    }

    @Test
    void fromRomanI() {
        int result = RomanNumeralsHelper.fromRoman("I");
        assertEquals(1, result);
    }

    @Test
    void fromRomanII() {
        int result = RomanNumeralsHelper.fromRoman("II");
        assertEquals(2, result);
    }

    @Test
    void fromRomanMM() {
        int result = RomanNumeralsHelper.fromRoman("MM");
        assertEquals(2000, result);
    }

    @Test
    void fromRomanMDCLXVI() {
        int result = RomanNumeralsHelper.fromRoman("MDCLXVI");
        assertEquals(1666, result);
    }

    @Test
    void fromRomanLXXXVI() {
        int result = RomanNumeralsHelper.fromRoman("LXXXVI");
        assertEquals(86, result);
    }

    @Test
    void fromRomanIX() {
        int result = RomanNumeralsHelper.fromRoman("IX");
        assertEquals(9, result);
    }
}