package D31_RepeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void mostCommonWordEmptyTest() {
        String book = " ";
        String expected = book;

        String actual = RepeatedWord.mostCommonWord(book);

        assertEquals(expected, actual);
    }

    @Test
    public void mostCommonWordNoRepeatTest() {
        String book = "I love cats";
        String expected = "cats";

        String actual = RepeatedWord.mostCommonWord(book);

        assertEquals(expected, actual);
    }

    @Test
    public void mostCommonWordOneRepeatTest() {
        String book = "Tacos are never better than tacos ";
        String expected = "tacos";

        String actual = RepeatedWord.mostCommonWord(book);

        assertEquals(expected, actual);
    }
    
}