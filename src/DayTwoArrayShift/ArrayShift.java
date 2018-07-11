package DayTwoArrayShift;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {

        int[] practiceArray = {4, 8, 15, 23, 42};
        int[] practiceAdd = {16};

        shiftArray(practiceArray, practiceAdd);

        System.out.println("original input data: array = " + Arrays.toString(practiceArray) + " new value to insert = " + practiceAdd);
        System.out.println("shiftArray function revised array is " + shiftedArray + ".");

        public static Arrays shiftArray ( int[] array, int[] newArrayValue){
            int[] shiftedArray = new int[array.length + 1];
            double halfArray = array.length / 2;

            System.out.println(halfArray);
            double midArrayPoint = Math.ceil(halfArray);

            System.out.println("this is the middle index value where the new array value will appear in the shifted array: " + midArrayPoint);


            for (int i = 0; i < shiftedArray.length; i++) {

                if (i < midArrayPoint) {
                    shiftedArray[i] = array[i];
                } else if (i == midArrayPoint) {
                    shiftedArray[i] = newArrayValue[0];
                } else if (i > midArrayPoint) {
                    shiftedArray[i] = array[i];
                }

            }
            System.out.println(Arrays.toString(shiftedArray));
        }
    }
}