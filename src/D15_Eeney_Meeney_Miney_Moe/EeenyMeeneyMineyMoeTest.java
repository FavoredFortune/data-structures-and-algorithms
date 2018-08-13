package D15_Eeney_Meeney_Miney_Moe;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EeenyMeeneyMineyMoeTest {

    @Test
    public void moeTest() {
        LinkedList<String> testList = new LinkedList<>();
        testList.add("A");
        testList.add("B");
        testList.add("C");
        testList.add("D");
        testList.add("E");

       String actual = EeenyMeeneyMineyMoe.moe(testList, 3);
       String expected = "D";

       assertEquals(expected,actual);
    }

    @Test
    public void moeEmptyTest() {
        LinkedList<String> emptyList = new LinkedList<>();

        String actual = EeenyMeeneyMineyMoe.moe(emptyList, 3);
        String expected = "This list is empty.";

        assertEquals(expected,actual);
    }

    @Test
    public void moeTinyTest() {
        LinkedList<String> tinyList = new LinkedList<>();
        tinyList.add("Larry");
        tinyList.add("Curly");
        tinyList.add("Moe");

        String actual = EeenyMeeneyMineyMoe.moe(tinyList, 1);
        String expected = "Moe";

        assertEquals(expected,actual);
    }
}