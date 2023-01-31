package arrays;

import java.util.Arrays;

public class SumIfTwoNumbersClosestToZero {
    /**
     * Given an array, find the elements whose sum is closest to zero
     */
    public static int[] sumClosestToZero(int[] A, int N) {
        Arrays.sort(A);
        int L=0;
        int R=N-1;
        int currentSum=0;
        int[] result = new int[2];

        while (L < R) {
            currentSum = A[L] + A[R];

            if (currentSum > 0) {
                R--;
            } else if (currentSum < 0){
                L++;
            } else {
                result[0] = A[L];
                result[1] = A[R];
                break;
            }
        }

        return result;
    }
}
