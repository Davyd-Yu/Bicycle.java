package iot.algo.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceDeleter {

    List<String> splitIntoSentences(String text) {
        List<String> sentences = new ArrayList<>();
        Pattern pattern = Pattern.compile("([^.!?]+[.!?]+\\s*)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            sentences.add(matcher.group().trim());
        }
        return sentences;
    }

    public boolean hasExclamationWithHyphenatedWords(String sentence) {
        Pattern pattern = Pattern.compile("\\b\\w+-\\w+(-\\w+)?\\b.*!+");
        Matcher matcher = pattern.matcher(sentence);
        return matcher.find();
    }


    public String joinSentences(List<String> sentences) {
        StringBuilder builder = new StringBuilder();
        boolean isFirstSentence = true;
        for (String sentence : sentences) {
            if (!sentence.endsWith("!")) {
                if (!isFirstSentence) {
                    builder.append(" ");
                }
                builder.append(sentence.replaceAll("\\s+-\\s+", " "));
                isFirstSentence = false;
            } else {
                Pattern pattern = Pattern.compile("\\b\\w+-\\w+\\b");
                Matcher matcher = pattern.matcher(sentence);
                int hyphenatedWordCount = 0;
                while (matcher.find()) {
                    hyphenatedWordCount++;
                }
                if (hyphenatedWordCount <= 2) {
                    if (!isFirstSentence) {
                        builder.append(" ");
                    }
                    builder.append(sentence.replaceAll("\\s+-\\s+", " "));
                    isFirstSentence = false;
                }
            }
        }
        return builder.toString().trim();
    }
}
