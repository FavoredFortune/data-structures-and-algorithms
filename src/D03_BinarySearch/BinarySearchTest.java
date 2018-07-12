package D03_BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    // testing empty array to make sure false result works
    @Test
    void searchArray0() {
        int[] sortedArray = {1,3,8};
        int key = 9;
        int expected = -1;
        int actual = BinarySearch.searchArray(sortedArray, key);

        assertEquals(expected, actual);
    }

    //testing array with an index value answer
    @Test
    void searchArray() {
        int[] sortedArray = {4, 8, 15, 16, 23, 42};
        int key = 15;
        int expected = 2;
        int actual = BinarySearch.searchArray(sortedArray, key);

        assertEquals(expected, actual);
    }

    //testing array with a -1 (fail/false) value answer
    @Test
    void searchArray1() {
        int[] sortedArray = {11, 22, 33, 44, 55, 66, 77};
        int key = 90;
        int expected = -1;
        int actual = BinarySearch.searchArray(sortedArray, key);

        assertEquals(expected, actual);
        }
}