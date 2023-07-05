package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NextPermutationTests {
    @Test
    public void nextPermutationTest1() {
        int[] arr = {1,2,3};
        Assertions.assertArrayEquals(NextPermutation.nextPermutation(arr), new int[]{1,3,2});
    }

    @Test
    public void nextPermutationTest2() {
        int[] arr = {3,2,1};
        Assertions.assertArrayEquals(NextPermutation.nextPermutation(arr), new int[]{1,2,3});
    }

    @Test
    public void nextPermutationTest3() {
        int[] arr = {2,1,5,4,3,0,0};
        Assertions.assertArrayEquals(NextPermutation.nextPermutation(arr), new int[]{2,3,0,0,1,4,5});
    }

}
