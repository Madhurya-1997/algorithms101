package arrays;

import org.junit.jupiter.api.Test;

public class RearrangeArrayTests {
    @Test
    public void rearrangeTest() {
        int[] arr = {3, 1, 0, 2, 4};
        int[] newArr = RearrangeArray.rearrange(arr);
        RearrangeArray.printArr(newArr);
    }

    @Test
    public void rearrangeOtpTest() {
        int[] arr = {3, 1, 0, 2, 4};
        int[] newArr = RearrangeArray.rearrangeOpt(arr);
        RearrangeArray.printArr(newArr);
    }
}
