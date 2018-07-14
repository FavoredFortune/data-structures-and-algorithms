package DayTwoArrayShift;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {

    }

    public static int[] shiftArray(int[] array, int[] newArrayValue) {
        int[] shiftedArray = new int[array.length + 1];
        double halfArray = shiftedArray.length / 2;
        double midArrayPoint = Math.ceil(halfArray);
        System.out.println("this is the middle index value where the new array value will appear in the shifted array: " + midArrayPoint);

        for (int i =0; i < (shiftedArray.length); i++) {
            if (i < midArrayPoint) {
                shiftedArray[i] =array[i];
            } else if (i == midArrayPoint) {
                shiftedArray[i] = newArrayValue[0];
            } else if (i > midArrayPoint) {
               shiftedArray[i] = array[i-1] ;
            }
            System.out.println(Arrays.toString(shiftedArray));
        } return shiftedArray;
    }
}

