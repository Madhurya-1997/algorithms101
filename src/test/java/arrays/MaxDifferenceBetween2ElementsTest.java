package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MaxDifferenceBetween2ElementsTest {
    @Test
    public void maxDifferenceBruteForceTest() {
        int[] arr = {4, 3, 10, 2, 9, 1, 6};
        int expectedVal = MaxDifferenceBetween2Elements.maxDifferenceBruteForce(arr);
        int actualVal = 7;
        Assertions.assertEquals(expectedVal, actualVal);
    }

    @Test
    public void maxDifferenceUsingKadaneTest() {
        int[] arr = {4, 3, 10, 2, 9, 1, 6};
        int expectedVal = MaxDifferenceBetween2Elements.maxDifferenceUsingKadane(arr);
        int actualVal = 7;
        Assertions.assertEquals(expectedVal, actualVal);
    }

    @Test
    public void maxDifferenceOptimizedTest() {
        int[] arr = {4, 3, 10, 2, 9, 1, 6};
        int expectedVal = MaxDifferenceBetween2Elements.maxDifferenceOptimized(arr);
        int actualVal = 7;
        Assertions.assertEquals(expectedVal, actualVal);
    }

    @Test
    public void maxDifferenceOptimizedTest2() {
        int[] arr = {3, 1, 4, 7, 5, 100, 10};
        int expectedVal = MaxDifferenceBetween2Elements.maxDifferenceOptimized(arr);
        int actualVal = 99;
        Assertions.assertEquals(expectedVal, actualVal);
    }
}
