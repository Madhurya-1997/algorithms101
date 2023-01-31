package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumIfTwoNumbersClosestToZeroTest {

    @Test
    public void sumClosestToZeroTest() {
        int[] arr = {4, 2, -1, 4, -2, 5, 6, 3};
        Assertions.assertArrayEquals(new int[]{-2, 2}, SumIfTwoNumbersClosestToZero.sumClosestToZero(arr, arr.length));
    }
}
