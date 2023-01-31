package arrays;

import java.util.Arrays;

public class SumOfThreeNumberEqualsX {
    /**
     * Given an array A and target X, find 3 numbers in A such that they add up to X
     */
    public static int[] sumOfThreeNumbersEqualsX(int[] A, int X) {
        Arrays.sort(A);
        int[] res = new int[3];

        for (int i=0; i<A.length-1; i++) {
            // fix 2 numbers
            int L = i+1;
            int R = A.length-1;

            while (L<R) {
                if (A[i]+A[L]+A[R] == X) {
                    res[0] = A[i];
                    res[1] = A[L];
                    res[2] = A[R];
                    break;
                } else if (A[i]+A[L]+A[R] > X) {
                    R--;
                } else {
                    L++;
                }
            }
        }
        return res;
    }
}
