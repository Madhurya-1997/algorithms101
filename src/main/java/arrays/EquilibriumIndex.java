package arrays;

public class EquilibriumIndex {
    /**
     * Find equilibrium index of an Array A.
     *
     * Eq Index (E) => sum of all element from index 0 to E == sum of remaining elements
     */
    public static int equilibriumIndexCostly(int[] A) {
        // T(N)=O(N^2)
        // S(N)=O(1)
        int E=0;

        for(int i=0; i<A.length; i++) {
            if (sum(A, 0, i) == sum(A, i+1, A.length-1)) {
                E = i;
            }
        }

        return E;
    }
    private static int sum(int[] A, int startIdx, int endIdx) {
        int sum=0;
        while(startIdx<=endIdx) {
            sum+=A[startIdx++];
        }
        return sum;
    }


    /**
     * use leftCumulativeSum and rightCumulativeSum
     */
    public static int equilibriumIndex(int[] A) {
        // T(N)=O(N)
        // S(N)=O(N)
        int[] left = new int[A.length];
        left[0] = A[0];
        int[] right = new int[A.length];
        right[right.length-1] = A[A.length-1];

        for(int i=1; i<A.length; i++) {
            left[i] = left[i-1] + A[i];
        }
        for(int i=A.length-2; i>0; i--) {
            right[i] = right[i+1] + A[i];
        }

        for (int i=0; i<A.length; i++) {
            if (left[i] == right[i+1]) {
                return i;
            }
        }

        return -1;
    }
}
