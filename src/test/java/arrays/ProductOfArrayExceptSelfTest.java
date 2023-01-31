package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductOfArrayExceptSelfTest {
    @Test
    public void productOfArrayExceptSelfTest() {
        int[] nums = {1, 2, 3, 4};
        int[] exp = ProductOfArrayExceptSelf.productOfArrayExceptSelf(nums);
        Assertions.assertArrayEquals(exp, new int[]{24, 12, 8, 6});
    }

    @Test
    public void productOfArrayExceptSelfTest1() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] exp = ProductOfArrayExceptSelf.productOfArrayExceptSelf(nums);
        Assertions.assertArrayEquals(exp, new int[]{0, 0, 9, 0, 0});
    }
}
