package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeparateZerosAndOnesTests {

    @Test
    public void separateTest() {
        int[] arr = {0,1,1,0,1,1,0};
        int[] actual = {0,0,0,1,1,1,1};
        Assertions.assertArrayEquals(SeparateZerosAndOnes.separate(arr), actual);
    }

    @Test
    public void separateUsingBitwiseTest() {
        int[] arr = {0,1,1,0,1,1,0};
        int[] actual = {0,0,0,1,1,1,1};
        Assertions.assertArrayEquals(SeparateZerosAndOnes.separateUsingBitOperation(arr), actual);
    }

    @Test
    public void separateEvensAndOddsUsingBitwiseTest() {
        int[] arr = {2, 3, 1, 2, 3, 1, 1};
        int[] actual = {2, 2, 1, 3, 3, 1, 1};
        Assertions.assertArrayEquals(SeparateZerosAndOnes.separateUsingBitOperation(arr), actual);
    }
}
