package searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    @Test
    public void binarySearchTest() {
        int[] arr = {2, 5, 7, 8, 11};
        Assertions.assertEquals(true, BinarySearch.binarySearch(arr, 8));
    }

    @Test
    public void twoSumTest() {
        int[] arr = {2, 5, 7, 8, 11};
        int[] exp = {0, 2};
        int[] res = BinarySearch.twoSum(arr, 9);
        Assertions.assertEquals(exp, res);
    }
}
