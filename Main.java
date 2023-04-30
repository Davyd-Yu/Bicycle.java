import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String text = "Hello! This is a sample text with multiple sentences. " +
                "It includes some exclamation sentences, like this one! " +
                "And also some hyphenated words, like pre-owned, pre-processed and self-contained! " +
                "Let's see if we can remove those sentences.";

        Pattern pattern = Pattern.compile("\\b[\\w-]+-[\\w-]+(\\s+[\\w-]+-[\\w-]+)+!\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String sentence = matcher.group();
            if (sentence.split("\\s+").length > 2) {
                text = text.replace(sentence, "");
            }
        }

        System.out.println(text);
    }
}