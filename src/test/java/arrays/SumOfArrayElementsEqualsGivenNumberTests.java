package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfArrayElementsEqualsGivenNumberTests {

    @Test
    public void test1() {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] expected = {{3, 2}, {4, 1}};
        Assertions.assertArrayEquals(expected, SumOfArrayElementsEqualsGivenNumber.getPairsOfArrayNumbers(arr, 5));
    }
}
