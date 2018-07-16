package D05_Matrix;

import java.util.Arrays;

public class RotateMatrix {
    public static int[][] main(int[][] superArray) {
        
        System.out.println("\nThere will be three reassignments of values to new indicies to rotate matrix by 90 " +
                "degrees clockwise.\n" + Arrays.deepToString(superArray) + ".\n");

        //variable to hold rotated sub-arrays temporarily
        int[] tempRow = new int[3];

        //final return matrix - pick the red pill!
        int[][] rotatedMatrix = new int[3][3];

        //left column becomes top row
        tempRow = new int[]{
                superArray[2][0],
                superArray[1][0],
                superArray[0][0]
        };

        //assigns new temporary row to the 0 index row of the final rotated matrix
        rotatedMatrix[0] = tempRow;

        System.out.println("The rotating matrix is now done with move 1. Here's the new temporary top row: " +
                Arrays.toString(rotatedMatrix[0]) + ". \n");

        //middle row is rearranged to account for column/row rotation of 90 degrees
        tempRow = new int []{
                superArray[2][1],
                superArray[1][1],
                superArray[0][1],
        };

        //assigns new temporary row to the 1 index row of the final rotated matrix
        rotatedMatrix[1] = tempRow;

        System.out.println("The rotating matrix is now done with move 2. Here's the temporary middle row: " +
                Arrays.toString(rotatedMatrix[1]) + ". \n");

        //right column becomes bottom row
        tempRow = new int[]{
                superArray[2][2],
                superArray[1][2],
                superArray[0][2]
        };

        //assigns new temporary row to the 2 index row of the final rotated matrix
        rotatedMatrix[2] = tempRow;

        System.out.println("The rotating matrix is now done moving . Here's the final rotated matrix: "
                + Arrays.deepToString(rotatedMatrix) + " .");
        return rotatedMatrix;
    }
}
