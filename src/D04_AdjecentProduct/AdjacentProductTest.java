package D04_AdjecentProduct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdjacentProductTest {

    @Test
    void largestProduct1() {
        //test values
        int[][] superArray = {
                {1, 2, 1},
                {2, 4, 2},
                {3, 6, 8},
                {7, 8, 1}
        };

        //expected and actual values for test method
        int expected = 64;
        int actual = AdjacentProduct.LargestProduct(superArray);

        //test method comparing two integers
        assertEquals(expected, actual);
    }

    @Test
    void largestProduct2() {
        //test values
        int[][] superArray = {
                {2, 4, 2, 7},
                {3, 6, 8, 10},
                {7, 8, 1, 1}
        };

        //expected and actual values for test method
        int expected = 80;
        int actual = AdjacentProduct.LargestProduct(superArray);

        //test method comparing two integers
        assertEquals(expected, actual);
    }

    @Test
    void largestProduct3() {
        //test values
        int[][] superArray = {
                {2, 4, 2, 7},
                {7, 8, 1, 1},
                {3, 2, 8, 20},
                {7, 8, 1, 1}
        };

        //expected and actual values for test method
        int expected = 160;
        int actual = AdjacentProduct.LargestProduct(superArray);

        //test method comparing two integers
        assertEquals(expected, actual);
    }
}