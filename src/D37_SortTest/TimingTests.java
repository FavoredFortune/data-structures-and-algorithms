import org.junit.Test;

import static org.junit.Assert.*;

public class TimingTests {

    @Test
    public void arrayTimeSelectionSortTenK() {
        int arraySize = 10000;
        double[] inputArray = SelectionSort.randomN(arraySize);
        System.out.println("Selection sort of 10K random array takes: ");
        System.out.println(SelectionSort.arrayTimeSelectionSort(inputArray) + " milliseconds");
    }

    @Test
    public void arrayTimeSelectionSortOneHundredK() {
        int arraySize = 100000;
        double[] inputArray = SelectionSort.randomN(arraySize);
        System.out.println("Selection sort of " + arraySize + " random array takes: " );
        System.out.println(SelectionSort.arrayTimeSelectionSort(inputArray) + " milliseconds");
    }

    @Test
    public void arrayTimeSelectionSortOneMillion() {
        int arraySize = 1000000;
        double[] inputArray = SelectionSort.randomN(arraySize);
        System.out.println("Selection sort of " + arraySize + " random array takes: " );
        System.out.println(SelectionSort.arrayTimeSelectionSort(inputArray) + " milliseconds");
    }
}