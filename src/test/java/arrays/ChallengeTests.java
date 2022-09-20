package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTests {

    @Test
    public void maxIndexDiffBruteForceTest() {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        Assertions.assertEquals(6, Challenge.maxIndexDiffBruteForce(arr, arr.length) );
    }

//    @Test
//    public void maxIndexDiffTest() {
//        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
//        Assertions.assertEquals(6, Challenge.maxIndexDiff(arr, arr.length) );
//    }
}
