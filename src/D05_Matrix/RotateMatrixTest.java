package D05_Matrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {

    @Test
    void main() {
        int[][] matrix = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };
        int[][] expectedMatrix = {
                {3, 2, 1},
                {3, 2, 1},
                {3, 2, 1}
        };
        String expected = Arrays.deepToString(expectedMatrix);

        int[][] actualMatrix = RotateMatrix.main(matrix);
        String actual = Arrays.deepToString(actualMatrix);
        assertEquals(expected,actual);
    }
    @Test
    void main1() {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] expectedMatrix = {
                {7,4,1},
                {8,5,2},
                {9,6,3}
        };
        String expected = Arrays.deepToString(expectedMatrix);

        int[][] actualMatrix = RotateMatrix.main(matrix);
        String actual = Arrays.deepToString(actualMatrix);
        assertEquals(expected,actual);
    }

    @Test
    void main2() {
        int[][] matrix = {
                {3, 2, 1},
                {3, 2, 1},
                {3, 2, 1}
        };
        int[][] expectedMatrix = {
                {3, 3, 3},
                {2, 2, 2},
                {1, 1, 1},
        };
        String expected = Arrays.deepToString(expectedMatrix);

        int[][] actualMatrix = RotateMatrix.main(matrix);
        String actual = Arrays.deepToString(actualMatrix);
        assertEquals(expected,actual);
    }
}