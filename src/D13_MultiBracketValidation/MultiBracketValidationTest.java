package D13_MultiBracketValidation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//using test cases from whiteboard 13 readme
class MultiBracketValidationTest {

    @Test
    void multiBracketValidationTestEmpty() {
        String test = "";
        boolean expected = MultiBracketValidation.multiBracketValidation(test);

        assertEquals(expected, true);
    }

    @Test
    void multiBracketValidationTestBalanced() {
        String test = "()[[Extra Characters]]";
        boolean expected = MultiBracketValidation.multiBracketValidation(test);

        assertEquals(expected, true);
    }

    @Test
    void multiBracketValidationTestUnbalanced() {
        String test = "{(})";
        boolean expected = MultiBracketValidation.multiBracketValidation(test);

        assertEquals(expected, false);
    }
}