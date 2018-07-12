package DayThreeBinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BinarySearchTest {

    @Test
    void searchArray() {
        int[] sortedArray = {4, 8, 15, 16, 23, 42};
        int key = 15;
        int expectedResult = 15;
        int actualResult= BinarySearch.searchArray(sortedArray,key);
        assertArrayEquals(expectedResult, actualResult);
    }
}