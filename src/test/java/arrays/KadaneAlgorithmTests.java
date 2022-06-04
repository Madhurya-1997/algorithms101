package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KadaneAlgorithmTests {


    @Test
    public void maxSumSubArrayTest() {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int expectedVal = KadaneAlgorithm.maxSumOfSubArray(arr);
        int actualVal = 7;
        Assertions.assertEquals(expectedVal, actualVal);
    }
}
