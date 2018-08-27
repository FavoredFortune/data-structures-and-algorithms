package D33_LeftJoin;


import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//thanks to Ahmed Ossan for the tip on the need for extending LeftJoin
class LeftJoinTest extends LeftJoin{

    @Test
    void leftJoinEmptyTest(){
        Map<String, String> right = new HashMap<>();
        Map<String, String> left = new HashMap<>();

        Map<String, List<String>> actual = leftJoin(left, right);
        Map<String, List<String>> expected = new HashMap<>();

        assertEquals (expected, actual);
    }

    @Test
    void leftJoinTinyTest(){
        Map<String, String> right = new HashMap<>();
        Map<String, String> left = new HashMap<>();

        left.put("hello","adios");
        left.put("bye","heya");
        left.put("orange","banana");

        right.put("hello", "goodbye");
        right.put("bye", "hi");
        right.put("orange", "apple");


        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        List<String> listC = new ArrayList<>();

        listA.add("adios");
        listA.add("goodbye");
        listB.add("heya");
        listB.add("hi");
        listC.add("banana");
        listC.add("apple");

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("hello", listA);
        expected.put("bye", listB);
        expected.put("orange", listC);

        Map<String, List<String>> actual;
        actual = leftJoin(left, right);

        assertEquals (expected, actual);
    }

    @Test
    void leftJoinPartEmptyTest(){
        Map<String, String> right = new HashMap<>();
        Map<String, String> left = new HashMap<>();

        left.put("hello", "goodbye");
        left.put("bye","heya");
        left.put("orange","banana");

        right.put("bye", "hi");
        right.put("orange", "apple");


        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        List<String> listC = new ArrayList<>();

        listA.add("goodbye");
        listA.add(null);
        listB.add("heya");
        listB.add("hi");
        listC.add("banana");
        listC.add("apple");

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("hello", listA);
        expected.put("bye", listB);
        expected.put("orange", listC);

        Map<String, List<String>> actual;
        actual = leftJoin(left, right);

        assertEquals (expected, actual);
    }

}