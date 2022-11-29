package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrappedRainWaterTest {

    @Test
    public void totalTrappedWaterOptimizedTest() {
        int[] arr = {1, 0, 2, 0, 1, 0, 3, 1, 0, 2};
        int exp = TrappedRainWater.totalTrappedWaterOptimized(arr);
        Assertions.assertEquals(exp, 9);
    }

    @Test
    public void totalTrappedWaterTest() {
        int[] arr = {1, 0, 2, 0, 1, 0, 3, 1, 0, 2};
        int exp = TrappedRainWater.totalTrappedWater(arr);
        Assertions.assertEquals(exp, 9);
    }
}
