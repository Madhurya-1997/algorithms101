package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static arrays.MaxDifferenceBetween2Elements.maxDifference;

public class MaxDifferenceBetween2ElementsTest {
    @Test
    public void maxDifferenceBruteForceTest() {
        int[] arr = {4, 3, 10, 2, 9, 1, 6};
        int expectedVal = MaxDifferenceBetween2Elements.maxDifferenceBruteForce(arr);
        int actualVal = 7;
        Assertions.assertEquals(expectedVal, actualVal);
    }

    @Test
    public void maxDifferenceOptimizedTest() {
        int[] arr = {4, 3, 10, 2, 9, 1, 6};
        int expectedVal = MaxDifferenceBetween2Elements.maxDifference(arr);
        int actualVal = 7;
        Assertions.assertEquals(expectedVal, actualVal);
    }
}
