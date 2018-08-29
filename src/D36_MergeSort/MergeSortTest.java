package D36_MergeSort;

//NOTE: code & test works only in new project
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {

    @Test
    public void mergeSortTestEmpty() {
        int[] expected = {};
        int[] actual = MergeSort.mergeSort(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void mergeSortTestSmall() {

        int[] expected = {1,2,3};
        int[] array = {3,1,2};
        int[] actual = MergeSort.mergeSort(array);
        for(int number: actual){
            System.out.println(number);
        }

        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeSort() {
    }

    @Test
    public void leftHalvesies() {
    }

    @Test
    public void rightHalvesies() {
    }

    @Test
    public void zip() {
    }
}