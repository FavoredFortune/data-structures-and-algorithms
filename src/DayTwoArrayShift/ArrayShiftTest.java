package DayTwoArrayShift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayShiftTest {

    @Test
    void emptyTest() {
        int[] practiceArray = {};
        int[] practiceAdd = {};
        int[] expectedArray = {};
        int[] returnArray = {};
        System.out.println(returnArray);
        assertArrayEquals(expectedArray, returnArray);
    }

    @Test
    void shiftArrayTest() {
        int[] practiceArray = {4, 8, 15, 23, 42};
        int[] practiceAdd = {16};
        int[] expectedArray = {4,8,15,16,23,42};
        int[] returnArray = ArrayShift.shiftArray(practiceArray,practiceAdd);
        System.out.println(returnArray);
        assertArrayEquals(expectedArray, returnArray);
    }

    @Test
    void shiftArrayTest1() {
        int[] practiceArray = {2,4,6,8};
        int[] practiceAdd = {5};
        int[] expectedArray = {2,4,5,6,8};
        int[] returnArray = ArrayShift.shiftArray(practiceArray,practiceAdd);
        System.out.println(returnArray);
        assertArrayEquals(expectedArray, returnArray);
    }
}