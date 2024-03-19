package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DigitSwap {

    public boolean calculate(int[] numbers){
        boolean hasFixedNumber = false;

        for(int i = 0; i < numbers.length; i++){
            if(i + 1 == numbers.length) break;
            int currentNumber = numbers[i];
            int nextNumber = numbers[i + 1];
            boolean hasPreviousNumber = i-1 >= 0;

            if(currentNumber >= nextNumber && hasFixedNumber == false){
                String currentNumberString = Integer.valueOf(currentNumber).toString();
                int[] newNumbers = this.charCombinations(currentNumberString);

                for(int number : newNumbers){
                    if(number < nextNumber && (hasPreviousNumber == false || hasPreviousNumber && number > numbers[i-1])) {
                        hasFixedNumber = true;
                        break;
                    }
                }

                if(hasFixedNumber == false) return false;
            } else if(currentNumber >= nextNumber && hasFixedNumber == true){
                return false;
            };
        }
        return true;
    }

    private int[] charCombinations(String numberString){
        List<Integer> possibleCombinations = new ArrayList<>();

        char[] parts = numberString.toCharArray();


        for(int i = 0; i < parts.length - 1; i++){
            char[] n = new char[parts.length];
            System.arraycopy(parts, 0, n, 0, parts.length);
            n[i] = parts[i+1];
            n[i+1] = parts[i];
            possibleCombinations.add(Integer.parseInt(new String(n)));
        }

        char[] n = new char[parts.length];
        System.arraycopy(parts, 0, n, 0, parts.length);
        n[0] = parts[parts.length -1];
        n[parts.length -1] = parts[0];
        possibleCombinations.add(Integer.parseInt(new String(n)));


        return possibleCombinations.stream().mapToInt(i->i).toArray();
    }
}
