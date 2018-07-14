package D05_Matrix;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {

        //in program test values
        int[][] matrix = {
                {1, 1,1},
                {2, 2, 2},
                {3, 3, 3}
        };
        System.out.println("There will be four moves to rotate this below by 90 degrees clockwise.\n" + Arrays
                .deepToString(matrix));

        //variable to hold rotated sub-arrays temporarily
        int[][] tempMatrix = new int[3][3];

        //final return matrix - pick the red pill!
        int[][] rotatedMatrix = new int[3][3];

        //left column becomes top row
        tempMatrix[0][2] = matrix[0][0];
        tempMatrix[0][1] = matrix[1][0];
        tempMatrix[0][0] = matrix[2][0];

        //assigns new temporary 0 index row to the final rotated matrix
        rotatedMatrix[0] = tempMatrix[0];

        System.out.println("The rotating matrix is now done with move 1. Here's the new temporary top row: " +
                Arrays.toString(rotatedMatrix[0]) + ". \n");

        System.out.println(matrix);

        //top row becomes right column
        tempMatrix[0][2] = matrix[0][0];
        tempMatrix[1][2] = matrix[0][1];
        tempMatrix[2][2] = matrix[0][2];     //like a tutu haha!

        //assigns new temporary 2 index column to the final rotated matrix
        rotatedMatrix[][2] = tempMatrix[][2];

        System.out.println("The rotating matrix is now done with move 2. Here's the temporary second column: " +
                Arrays.toString(rotatedMatrix[][2]) + ". \n");

        //right column becomes bottom row
        rotatedMatrix[2][2] = matrix[0][2];      //r2? are you there?
        rotatedMatrix[2][1] = matrix[1][2];
        rotatedMatrix[0][2] = matrix[2][2];      //2b or not 2b?
        System.out.println("The rotating matrix is now done with move 3. Here's the temporary matrix:"
                + Arrays.deepToString(rotatedMatrix) + " . \n");

        //bottom row becomes left column
        rotatedMatrix[0][0] = matrix[2][0];
        rotatedMatrix[0][1] = matrix[2][1];
        rotatedMatrix[0][2] = matrix[2][1];
        System.out.println("The rotating matrix is now done with move 4. Here's the final rotated matrix: " + Arrays
                .deepToString(rotatedMatrix));
    }
}
