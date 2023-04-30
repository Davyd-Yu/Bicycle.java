import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testRemoveHyphenatedExclamations() {
        String inputText = "This is a test sentence! It includes hyphenated words like self-contained and well-known! " +
                "There are also some other sentences! This one is short! But this one is not that short! " +
                "Let's see if the code removes hyphenated exclamations!";
        String expectedText = "This is a test sentence! There are also some other sentences! This one is short! " +
                "Let's see if the code removes hyphenated exclamations!";
        String actualText = Main.removeHyphenatedExclamations(inputText);
        assertEquals(expectedText, actualText);
    }
}