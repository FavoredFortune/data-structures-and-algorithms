import java.util.Random;

public class SelectionSort {

    //thanks to javaTpoint for more on this method and it's space/time implications
    //https://www.javatpoint.com/selection-sort-in-java
    //this approach is at worst 0(n2) in time
    //this approach is only O(1) in space

    public static double[] selectionSort(double[] inputArray){
        //variable to track original input array size and use for creating
        //result array size as well as iterating through the input array
        //for sorting
        int size = inputArray.length;

        //address edge case of empty input array
        if(size == 0){
            return inputArray;
        }

        for(int i = 0; i < size-1; i++) {
            //extra counter just for result to help search for lowest value index
            int index = i;

            //second iteration within the array and added conditions
            //from Java2novice
            //http://www.java2novice.com/java-sorting-algorithms/selection-sort/
            for (int j = i + 1; j < size; j++) {
                //looking for smallest minumum values in input array
                if (inputArray[j] < inputArray[index]) {
                    //searching for the lowest index
                    index = j;
                }
            }
            //start of temp for holding lowest value for result array
            double minTemp = inputArray[index];
            inputArray[index] = inputArray[i];
            inputArray[i] = minTemp;
        }
         return inputArray;
    }

    public static boolean isSorted(double[] inputArray){

        for(int i = 0; i< inputArray.length-1; i++){
            if(inputArray[i+1] < inputArray[i]){
                return false;
            }
        }return true;
    }

    public static double[] randomN(int arraySize){
        double[] randomArray = new double[arraySize];

        for(int i = 0; i<arraySize; i++){
            //my way of writing it commented out and saved for reference
            //randomArray[i] =  Math.random()*arraySize;

            //using Random method and nextDouble from Java library
            //https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#nextDouble--
            //per Whiteboard instructions/documentation
            //https://canvas.instructure.com/courses/1362473/assignments/8861129
            Random random = new Random();
            randomArray[i] = random.nextDouble()*arraySize;
        }
        return randomArray;
    }

    public static double[] copy(double[] inputArray){
        double[] copyArray = new double[inputArray.length];
        for(int i = 0; i < inputArray.length; i++){
            copyArray[i] = inputArray[i];
        }
        return copyArray;
    }

    //more on currentTimeMiliseconds in Java from Java docs
    //https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#currentTimeMillis--
    //more on use of currentTimeMiliseconds from class lecture and whiteboard documentation
    public static long arrayTimeSelectionSort(double[] inputArray){
        long start = System.currentTimeMillis();
        SelectionSort.selectionSort(inputArray);
        long delta = System.currentTimeMillis() - start;

        return delta;
    }

    //not sure how to refactor to take in parameter of a sort method to be determined when used,
    //so replicating for now for other sort method, but would like to understand how to refactor in the future.
    public static long arrayTimeMergeSort(double[] inputArray){
        long start = System.currentTimeMillis();
        MergeSort.mergeSort(inputArray);
        long delta = System.currentTimeMillis() - start;

        return delta;
    }

    public static void arrayTimeSort(int arraySize){
        double[] selectionArray =  SelectionSort.randomN(arraySize);
        double[] mergeArray = SelectionSort.copy(selectionArray);

        long start = System.currentTimeMillis();
        SelectionSort.selectionSort(selectionArray);
        long delta = System.currentTimeMillis() - start;

        System.out.println("Selection sort of " + arraySize + " random array takes: " + delta + " milliseconds");

        long start2 = System.currentTimeMillis();
        MergeSort.mergeSort(mergeArray);
        long delta2 = System.currentTimeMillis() - start2;

        System.out.println("Merge sort of " + arraySize + " random array takes: " + delta2 + " milliseconds");

    }

}
