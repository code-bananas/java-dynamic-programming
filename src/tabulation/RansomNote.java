package tabulation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> magazineLetters = magazine.chars()
                .mapToObj(e -> (char) e).collect(Collectors.toCollection(ArrayList::new));

        for (Character noteLetter : ransomNote.chars().mapToObj(e -> (char) e).toList()) {
            int indexOfLetter = magazineLetters.indexOf(noteLetter);
            if (indexOfLetter > -1) {
                magazineLetters.remove(indexOfLetter);
            } else {
                return false;
            }
        }
        return true;
    }
}
