package D04_AdjecentProduct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdjacentProductTest {

    @Test
    void largestProduct() {
        //test values
        int[][] superArray = {
                {67,68,29,53},
                {2,4,16,7,8},
                {43,65,77,88}
        };

        //expected and actual values for test method
        int expected = 4556;
        int actual = AdjacentProduct.LargestProduct(superArray);

        //test method comparing two integers
        assertEquals(expected, actual);
    }

    @Test
    void largestProduct1() {
        //test values
        int[][] superArray = {
                {1,2,1},
                {2,4,2},
                {3,6,8},
                {7,8,1}
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
                {12, 20, 13, 44},
                {2,4,2,7},
                {3,6,8, 10},
                {7,8,1, 1}
        };

        //expected and actual values for test method
        int expected = 572;
        int actual = AdjacentProduct.LargestProduct(superArray);

        //test method comparing two integers
        assertEquals(expected, actual);
    }

    @Test
    void greatestValue() {
        int[][] superArray = {
                {67,68,29,53},
                {2,4,16,8},
                {43,65,77,88}
        };

        int expected = 4556;
        int actual = AdjacentProduct.greatestValue(superArray,0,0 );

        //test method comparing two integers
        assertEquals(expected, actual);

    }

    @Test
    void greatestValue1() {
        int[][] superArray = {
                {1,1,1,53},
                {2,1,1,1},
                {1,2,3,8}
        };

        int expected = 53;
        int actual = AdjacentProduct.greatestValue(superArray,0,0 );

        //test method comparing two integers
        assertEquals(expected, actual);

    }
}