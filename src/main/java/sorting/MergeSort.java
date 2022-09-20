package sorting;

public class MergeSort {

    public static void mergeSort(int[] A, int P, int R) {
        if (P < R) {
            int Q = Math.round((P+R)/2);

            mergeSort(A, P, Q);
            mergeSort(A, Q+1, R);
            merge(A, P, Q, R);
        }
    }


    /**
     * P => starting index of A
     * Q => middle index of A
     * R => last index of A
     * @param A
     * @param P
     * @param Q
     * @param R
     */
    private static void merge(int[] A, int P, int Q, int R) {
        // {1, 5, 7, 8, 2, 6, 9, 10}
        int N1 = Q - P + 1;
        int N2 = R - Q;

        // create 2 small arrays of lengths N1 & N2
        int[] left = new int[N1];
        int[] right = new int[N2];

        for (int i=0; i<left.length; i++) {
            left[i] = A[P+i];
        }
        for (int i=0; i<right.length; i++) {
            right[i] = A[Q + i + 1];
        }

        int i=0; // pointer for left arr
        int j=0; // pointer for right arr
        int k = P;
        while (i < N1 && j < N2) {
            if (left[i] < right[j]) {
                A[k] = left[i];
                i++;
            } else {
                A[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < N1) {
            A[k] = left[i];
            i++;
            k++;
        }
        while(j < N2) {
            A[k] = right[j];
            j++;
            k++;
        }
    }
}
