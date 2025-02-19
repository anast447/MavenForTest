import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class LR8Test {

    @Test
    public void testReplaceWithShortWord() {
        String text = "Привет";
        int k = 3;
        char replacementChar = '$';
        String expected = "При$ет";
        String actual = LR8_ReplaceText.replace(text, k, replacementChar);
        assertEquals(expected, actual);
    }

    @Test
    public void testReplaceWithLongWord() {
        String text = "Привет Влад";
        int k = 4;
        char replacementChar = '#';
        String expected = "При#ет Вла#";
        String actual = LR8_ReplaceText.replace(text, k, replacementChar);
        assertEquals(expected, actual);
    }

    @Test
    public void testReplaceWithNoChange() {
        String text = "Привет";
        int k = 10; // k больше длины слова
        char replacementChar = '*';
        String expected = "Привет";
        String actual = LR8_ReplaceText.replace(text, k, replacementChar);
        assertEquals(expected, actual);
    }

    @Test
    public void testReplaceMultipleWords() {
        String text = "Привет Влад, ты лабы по джаве сделал?";
        int k = 3;
        char replacementChar = '$';
        String expected = "Прив$т Вл$д, ты лабы по джаве сделал?";
        String actual = LR8_ReplaceText.replace(text, k, replacementChar);
        assertEquals(expected, actual);
    }
}