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
}
