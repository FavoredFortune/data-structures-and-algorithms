import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class D01_ArrayReverseTest {
    @org.junit.jupiter.api.Test
    private void reverseArray() throws Exception {
        int[] inputNumbers = {1, 2, 3, 4, 5, 6};
        DO1_ArrayReverse.reverseArray(inputNumbers);
        int[] outputNumbers = {6, 5, 4, 3, 2, 1};
        assertArrayEquals(inputNumbers, outputNumbers, "success");
    }
}
