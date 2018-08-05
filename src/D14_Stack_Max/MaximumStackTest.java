package D14_Stack_Max;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumStackTest {
    @Test
    void maxVanillaTest(){
        MaximumStack testStack = new MaximumStack();
        testStack.push(5);
        testStack.push(3);
        testStack.push(2);
        testStack.push(1);

        int actual = testStack.max();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void maxEmptyTest(){
        MaximumStack testStack = new MaximumStack();

        int actual = testStack.max();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void maxNegativeIntTest(){
        MaximumStack testStack = new MaximumStack();
        testStack.push(-5);
        testStack.push(3);
        testStack.push(-2);
        testStack.push(1);

        int actual = testStack.max();
        int expected = 3;

        assertEquals(expected, actual);
    }

}