import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSortTestEmpty() {
        int[] expected = {};
        int[] actual = MergeSort.mergeSort(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void mergeSortTestSmallOdd() {

        int[] expected = {1,2,3};
        int[] array = {3,1,2};
        int[] actual = MergeSort.mergeSort(array);
        for(int number: actual){
            System.out.println(number);
        }

        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeSortTestSmallEven() {

        int[] expected = {1,2,3,4};
        int[] array = {3,1,4,2};
        int[] actual = MergeSort.mergeSort(array);

        for(int number: actual){
            System.out.println(number);
        }

        assertArrayEquals(expected, actual);
    }


    @Test
    public void mergeSortTestLargeEven() {

        int[] expected = {1,2,3,4,11,12,77,101};
        int[] array = {3,1,4,2,101,77,12,11};
        int[] actual = MergeSort.mergeSort(array);

        for(int number: actual){
            System.out.println(number);
        }

        assertArrayEquals(expected, actual);
    }
    @Test
    public void mergeSortTestLargeOdd() {

        int[] expected = {1,2,3,4,11,12,77,88,101};
        int[] array = {3,1,88,4,2,101,77,12,11};
        int[] actual = MergeSort.mergeSort(array);

        for(int number: actual){
            System.out.println(number);
        }

        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeSortTestOne() {

        int[] expected = {1};
        int[] array = {1};
        int[] actual = MergeSort.mergeSort(array);

        for(int number: actual){
            System.out.println(number);
        }

        assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeSortTestTwo() {

        int[] expected = {1,12};
        int[] array = {12,1};
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