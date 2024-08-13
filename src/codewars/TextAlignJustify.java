package codewars;

import java.util.ArrayList;
import java.util.List;

public class TextAlignJustify {
    public String justify(String text, int width) {
        String[] words = text.split(" ");
        List<String> lines = new ArrayList<>();
        List<String> line = new ArrayList<>();
        int lineWidth = 0;

        for (String word : words) {
            if (lineWidth + line.size() + word.length() > width) {
                lines.add(String.join(" ", line));
                line.clear();
                lineWidth = 0;
            }
            line.add(word);
            lineWidth += word.length();
        }
        lines.add(String.join(" ", line));

        for (int i = 0; i < lines.size() - 1; i++) {
            String[] lineWords = lines.get(i).split(" ");

            if(lineWords.length == 1){
                lines.set(i, lineWords[0]);
                continue;
            }
            int space = width - lines.get(i).length() + lineWords.length - 1;
            int avgSpace = space / (lineWords.length - 1);
            int extraSpace = space % (lineWords.length - 1);

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < lineWords.length - 1; j++) {
                sb.append(lineWords[j]);
                sb.append(" ".repeat(avgSpace + (j < extraSpace ? 1 : 0)));
            }

            sb.append(lineWords[lineWords.length - 1]);
            lines.set(i, sb.toString());
        }

        return String.join("\n", lines);
    }
}
