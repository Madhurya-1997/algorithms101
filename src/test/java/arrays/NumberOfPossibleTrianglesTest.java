package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfPossibleTrianglesTest {
    @Test
    public void numberOfPossibleTrianglesTest() {
        int[] arr = {4,1,3,2};
        int expected = NumberOfPossibleTriangles.numberOfPossibleTriangles(arr, arr.length);
        Assertions.assertEquals(expected, 1);
    }
}
