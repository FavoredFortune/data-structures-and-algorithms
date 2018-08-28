package D04_AdjecentProduct;

import java.lang.Math;

public class AdjacentProduct {
    public static void main(String[] args) {
        //in program test values
        int[][] superArray = {
                {1, 2, 1},
                {2, 4, 2},
                {7, 10, 1}
        };
        //in program invocation of LargestProduct method
        int result = LargestProduct(superArray);
        System.out.println("The largest product of any two neighbor elements contained in arrays within this outer " +
                "array is: " + result);
    }

    public static int LargestProduct(int[][] superArray) {
        //use this variable to track the largest product produced by any two neighboring elements within the super
        // array in all directions
        int largestValue = 0;
        for (int row = 0; row < superArray.length; row++) {

            //used sys.out.println to check to make sure method was moving through for loops as expected
//            System.out.println("super Array length " + superArray.length +" row "+ row);

            for (int col = 0; col < superArray[row].length; col++) {
                int product = greatestValue(superArray, row, col);

                //used sys.out.prntln to check greatest value method's result
//                System.out.println("product is: " + product);

                if (product > largestValue) {
                    largestValue = product;
                }
            }
        }
        System.out.println("The largest product of any two neighboring elements within each array of the outer array " +
                "is: " + largestValue);
        return largestValue;
    }


    public static int greatestValue(int[][] superArray, int row, int col) {

        //initialize each item within each array, within the outer array aka superArray
        int element = superArray[row][col];
        int largestValue = 0;

//        for (row = 0; row < superArray.length; row++) {

            //used sys.out.println to check to make sure method was moving through for loops as expected
//            System.out.println("super Array length " + superArray.length + " row " + row);

//            for (col = 0; col < superArray.length; col++) {

                //checking elements to the right
                if ((col + 1) < superArray[row].length) {
                    largestValue = Math.max(largestValue, element * superArray[row][col + 1]);

                    //testing out each loop
                    // System.out.println("to the right: " + largestValue);
                }

                //checking elements below to the right
                if ((col + 1) < superArray[row].length && (row + 1) < superArray.length) {
                    largestValue = Math.max(largestValue, element * superArray[row + 1][col + 1]);

                    //testing out each loop
//                    System.out.println("to the bottom right: " + largestValue);
                }

                //checking elements below
                if ((row + 1) < superArray.length) {
                    largestValue = Math.max(largestValue, element * superArray[row + 1][col]);

                    //testing out each loop
//                    System.out.println("to the bottom: " + largestValue);
                }

                //checking elements below to the  left
                if ((row + 1) < superArray.length && (col - 1) > 0) {
                    largestValue = Math.max(largestValue, element * superArray[row + 1][col - 1]);

                    //testing out each loop
//                    System.out.println("to the left: " + largestValue);
                }
        return largestValue;
            }
        }

