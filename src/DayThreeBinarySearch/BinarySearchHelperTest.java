package DayThreeBinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchHelperTest {

    @Test
    void searchHelperRight() {
        int m = 3;
        int[] sortedArray = {4, 8, 15, 16, 23, 42};
        int key = 15;
        int expectedResult = 15;
        int actualResult = BinarySearch.searchHelperRight(m, sortedArray,key);
        assertArrayEquals(expectedResult,actualResult);

    }
}