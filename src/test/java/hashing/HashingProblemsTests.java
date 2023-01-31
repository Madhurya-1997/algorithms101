package hashing;

import hashing.HashingProblems;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashingProblemsTests {

    @Test
    public void containsDuplicateInKDistanceTest(){
        int[] arr = {5, 1, 2, 3, 2, 1};
        boolean expected = HashingProblems.containsDuplicateInKDistance(arr, 3);
        Assertions.assertEquals(expected, true);

    }

    @Test
    public void disjointSetsBruteForceTest(){
        int[] arr1 = {5, 1, 2, 3, 2, 1};
        int[] arr2 = {7, 3, 4, 0, 9};

        boolean expected = HashingProblems.disjointSetsBruteForce(arr1, arr2);
        Assertions.assertEquals(expected, false);

    }
    @Test
    public void disjointSetsBruteForceTest2(){
        int[] arr1 = {5, 1, 2, 3, 2, 1};
        int[] arr2 = {7, 10, 4, 0, 9};

        boolean expected = HashingProblems.disjointSetsBruteForce(arr1, arr2);
        Assertions.assertEquals(expected, true);

    }

    @Test
    public void disjointSetsOptimizedTest(){
        int[] arr1 = {5, 1, 2, 3, 2, 1};
        int[] arr2 = {7, 10, 4, 0, 9};

        boolean expected = HashingProblems.disjointSetsOptimized(arr1, arr2);
        Assertions.assertEquals(expected, true);

    }
    @Test
    public void disjointSetsOptimizedTest2(){
        int[] arr1 = {5, 1, 2, 3, 2, 1};
        int[] arr2 = {7, 3, 4, 0, 9};

        boolean expected = HashingProblems.disjointSetsOptimized(arr1, arr2);
        Assertions.assertEquals(expected, false);

    }

    @Test
    public void numOfSubArraysWithSumZeroTest() {
        int[] arr1 = {11, 10, -5, -3, -2, 10, 5, -1, -6};

        Assertions.assertEquals(HashingProblems.numOfSubArraysWithSumZero(arr1), 2);
    }
}
