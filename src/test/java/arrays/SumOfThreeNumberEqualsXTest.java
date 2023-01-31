package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfThreeNumberEqualsXTest {
    @Test
    public void sumOfThreeNumbersEqualsXTest() {
        int[] A = {6, 9, 2, 1, 5, 10};
        Assertions.assertArrayEquals(new int[]{1,5,9}, SumOfThreeNumberEqualsX.sumOfThreeNumbersEqualsX(A, 15));
    }
}
