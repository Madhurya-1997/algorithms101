package arrays;

import java.util.Arrays;

public class NumberOfPossibleTriangles {

    /**
     * Given an unsorted array of positive numbers.
     * Find no of triangles that can be formed with 3 different elements
     * as 3 sides of the triangle
     *
     * ex. {4, 1, 3, 2}
     * no of triangle = 1
     * {2, 3, 4} => only set
     */

    public static int numberOfPossibleTriangles(int[] arr, int N) {
        int sum = 0;

        Arrays.sort(arr);
        for (int i=0; i<=N-3; i++) {
            int k = i+2;
            for (int j=i+1; j<=N-2; j++) {
                while (k < N && arr[i] + arr[j] > arr[k]) {
                    k++;
                }
                sum += k - (j+1);
            }
        }
        return sum;
    }
}
