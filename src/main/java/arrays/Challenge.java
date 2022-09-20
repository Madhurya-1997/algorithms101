package arrays;

public class Challenge {

    /**
     * Given an array A[] of N positive integers. The task is to find the max value of
     * j-i such that A[j] >= A[i] & j >= i
     *
     * if no indices found, return -1;
     */
    public static int maxIndexDiffBruteForce(int[] A, int N) {
//        N => length
        int res = -1;
        for (int i = 0; i < N-1; i++) {
            for (int j=i; j<N; j++) {
                if (A[j] >= A[i] ) {
                    int diff = j - i;

                    if (diff > res) {
                        res = diff;
                    }
                }
            }
        }

        return res;
    }


}
