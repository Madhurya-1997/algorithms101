package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Find the maximum difference between 2 elements in an array
 * such that the max element appears after the smaller element
 */
public class MaxDifferenceBetween2Elements {

    // {4, 3, 10, 2, 9, 1, 6}
    public static int maxDifferenceBruteForce(int[] arr) {
        int currentMax = 0;

        for (int i=0; i<arr.length; i++) {
            int a = arr[i];
            for (int j=i+1; j<arr.length; j++) {
                int b = arr[j];

                if (b > a && b-a > currentMax) {
                    currentMax = b-a;
                }
            }
        }

        return currentMax;
    }

    public static int maxDifferenceUsingKadane(int[] arr) {
        int[] diff = new int[arr.length-1];

        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int i=0; i<arr.length-1; i++) {
            diff[i] = arr[i+1] - arr[i];
        }

        for (int i=0; i<diff.length; i++) {
            maxEndingHere += diff[i];

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }

            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }

    public static int maxDifferenceOptimized(int[] arr) {
        int maxDiff = 0;
        int a = Integer.MAX_VALUE;

        for (int i=0; i<arr.length - 1; i++) {
            int b = arr[i+1];

            if (arr[i] < a) {
                a = arr[i];
            }

            if (b-a > maxDiff) {
                maxDiff = b - a;
            }
        }
        return maxDiff;
    }
}
