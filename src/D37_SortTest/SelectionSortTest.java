import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void selectionSortEmpty() {

        double[] inputArray = new double[0];

        double[] actual = SelectionSort.selectionSort(inputArray);

       assertEquals(inputArray.toString(), actual.toString());
    }

    @Test
    public void selectionSortSmall() {

        double[] inputArray = {4,25,3,14};
        double[] expected = {3,4,14,25};
        double[] actual = SelectionSort.selectionSort(inputArray);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void selectionSortLarge() {

        double[] inputArray = {4,25,3,14,77,44,1,22,33,101.1,101.7};
        double[] expected = {1,3,4,14,22,25,33,44,77,101.1,101.7};
        double[] actual = SelectionSort.selectionSort(inputArray);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void selectionSortNegZero() {

        double[] inputArray = {4,25,3,14,77,44,1,22,0,-11,2.4};
        double[] expected = {-11,0,1,2.4,3,4,14,22,25,44,77};
        double[] actual = SelectionSort.selectionSort(inputArray);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}