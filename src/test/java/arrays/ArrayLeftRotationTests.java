package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayLeftRotationTests {

    @Test
    public void oneElementTest() {
        int[] arr = {3};
        int[] expected = {3};
        int[] actual = ArrayLeftRotation.leftRotate(arr, 5);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void zeroStepRotationTest() {
        int[] arr = {3,1,2};
        int[] expected = {3,1,2};
        int[] actual = ArrayLeftRotation.leftRotate(arr, 0);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void overStepRotationTest() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {2, 3, 4, 5, 1};
        int[] actual = ArrayLeftRotation.leftRotate(arr, 6);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void equalStepRotationTest() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = ArrayLeftRotation.leftRotate(arr, 5);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lowerStepRotationTest() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {3, 4, 5, 1, 2};
        int[] actual = ArrayLeftRotation.leftRotate(arr, 2);
        Assertions.assertArrayEquals(expected, actual);
    }
}
