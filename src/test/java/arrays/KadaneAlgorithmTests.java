package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KadaneAlgorithmTests {


    @Test
    public void maxSumOfSubArrayTest() {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int expectedVal = KadaneAlgorithm.maxSumOfSubArray(arr);
        int actualVal = 7;
        Assertions.assertEquals(expectedVal, actualVal);
    }

    @Test
    public void maxSumSubArrayTest1() {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int[] expected = KadaneAlgorithm.maxSumSubArray(arr);
        int[] actual = {4,-1,-2,1,5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void maxSumSubArrayTest2() {
        int[] arr = {-3, 10, 5, -20, 4, 11, -5, 7};
        int[] expected = KadaneAlgorithm.maxSumSubArray(arr);
        int[] actual = {4, 11, -5, 7};
        Assertions.assertArrayEquals(expected, actual);
    }
}
