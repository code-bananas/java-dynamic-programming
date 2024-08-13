package codewars;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralsHelper
{
    private static final Map<String, Integer> romanNumerals;

    static {
        Map<String, Integer> aMap = new LinkedHashMap<>();
        aMap.put("M", 1000);
        aMap.put("CM", 900);
        aMap.put("D", 500);
        aMap.put("CD", 400);
        aMap.put("C", 100);
        aMap.put("XC", 90);
        aMap.put("L", 50);
        aMap.put("XL", 40);
        aMap.put("X", 10);
        aMap.put("IX", 9);
        aMap.put("V", 5);
        aMap.put("IV", 4);
        aMap.put("I", 1);
        romanNumerals = Collections.unmodifiableMap(aMap);
    }

    public static String toRoman(int n){
        StringBuilder result = new StringBuilder();
        Integer remainingInteger = n;

        for (Map.Entry<String, Integer> entry : romanNumerals.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            int count = remainingInteger / value;
            remainingInteger = remainingInteger % value;

            result.append(String.valueOf(key).repeat(count));
        }

        return result.toString();
    }

    public static int fromRoman(String romanNumeral){
        Integer result = 0;
        String remainingRomanNumeral = romanNumeral;

        for (Map.Entry<String, Integer> entry : romanNumerals.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            while (remainingRomanNumeral.startsWith(key)) {
                result += value;
                remainingRomanNumeral = remainingRomanNumeral.substring(key.length());
            }
        }

        return result;
    }

}
