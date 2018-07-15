package D03_BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
    }

    //after whiteboarding out the problem with Travis and David this morning,
    //much better understanding of the problem

    //this method is meant to return the index of an array where an array value = the key (search term)
    //if there is no match, this program must return -1
    public static int searchArray(int[] sortedArray, int key) {
        int startArray = 0;
        int endArray = sortedArray.length - 1;

        //find the middle index of the array
        int middle = (int) Math.floor((endArray + startArray) / 2);

        while (startArray < endArray) {
            if (sortedArray[middle] == key) {
                return middle;
            } else if (sortedArray[middle] < key) {
                middle = (int) Math.floor((startArray + middle) / 2);
                startArray++;
                //testing each step of the while loop - comment in to run without the test file
//                System.out.println("(less than test) incremental value of index is currently: " + startArray);
            } else if (sortedArray[middle] > key) {
                startArray = (int) Math.floor((middle + endArray) / 2);
                middle++;
                //testing each step of the while loop - comment in to run without the test file
//                System.out.println("(greater than test) incremental value of index is currently: " + startArray);
            }
        }
        return -1;
    }
}