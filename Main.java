package iot.algo.part2;


import java.util.ArrayList;
import java.util.List;

public class Main extends SentenceDeleter {
    public static void main(String[] args) {
        Main remover = new Main();

        String text = "This is an example of a sentence with pre-owned hyphenated-word! " +
                "What a beautiful-day it-is today! " +
                "I can't believe it's already May! " +
                "What-an -amazing-performance by the dancers!"
                + "Something and text text!";

        List<String> sentences = remover.splitIntoSentences(text);

        List<String> filteredSentences = new ArrayList<>();
        for (String sentence : sentences) {
            if (!remover.hasExclamationWithHyphenatedWords(sentence)) {
                filteredSentences.add(sentence.replaceAll("\\s+-\\s+", " "));
            }
        }

        String result = remover.joinSentences(filteredSentences);
        System.out.println(result);
    }

}