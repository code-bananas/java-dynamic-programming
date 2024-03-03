import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DigitSwap {

    public boolean calculate(int[] numbers){
        boolean hasSwappedNumber = false;

        for(int i = 0; i < numbers.length -1; i++){
            int currentNumber = numbers[i];
            int nextNumber = numbers[i + 1];

            if(currentNumber >= nextNumber && hasSwappedNumber == false){
                hasSwappedNumber = true;
                String currentNumberString = Integer.valueOf(currentNumber).toString();
                boolean foundGoodNumber = false;

                for(int x = 1; x < currentNumberString.length() - x; x ++){
                    int[] newNumbers = this.charCombinations(currentNumberString);

                    for(int c = 0; c < newNumbers.length; c ++){

                        if(newNumbers[c] < nextNumber) {
                            foundGoodNumber = true;
                            break;
                        }
                    }
                    if(foundGoodNumber == true) break;
                }

                if(foundGoodNumber == false) return false;
            } else if(currentNumber >= nextNumber && hasSwappedNumber == true){
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
