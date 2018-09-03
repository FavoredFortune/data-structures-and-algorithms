import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SelectionSortAddedTests {

    @Test
    public void isSortedTrue() {
        double[] inputArray = {4,25,3,14};
        double[] actual = SelectionSort.selectionSort(inputArray);
        assertTrue(SelectionSort.isSorted(actual));
    }

    @Test
    public void isSortedFalse() {
        double[] inputArray = {4,25,3,14};
        assertTrue(SelectionSort.isSorted(inputArray));
    }

    @Test
    public void isSortedEmpty() {
        double[] inputArray = {};
        assertTrue(SelectionSort.isSorted(inputArray));
    }

    @Test
    public void randomNSmall() {
        int arraySize = 10;
        double[] actual = SelectionSort.randomN(10);

        assertEquals(arraySize,actual.length );
    }

    @Test
    public void randomNMedium() {
        int arraySize = 100;
        double[] actual = SelectionSort.randomN(100);

        assertEquals(arraySize,actual.length );
    }

    @Test
    public void randomNLarge() {
        int arraySize = 1000;
        double[] actual = SelectionSort.randomN(1000);

        assertEquals(arraySize,actual.length );
    }

    @Test
    public void copySmall() {
        double[] inputArray = {4,25,3,14};
        double[] expected = {4,25,3,14};
        double[] actual = SelectionSort.copy(inputArray);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void copyEmpty() {
        double[] inputArray = {};
        double[] expected = {};
        double[] actual = SelectionSort.copy(inputArray);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void copyLarge() {
        double[] inputArray = {4,25,3,14,77,44,1,22,33,101.1,101.7};
        double[] expected = {4,25,3,14,77,44,1,22,33,101.1,101.7};
        double[] actual = SelectionSort.copy(inputArray);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}