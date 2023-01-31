package arrays;

public class FindXFromMatrix {
    /**
     * Given a square matrix A, where all rows and cols are sorted in ascending order
     * Given X, check whether X is present in A
     */
    // O(NM)
    public static boolean findXInMatrixBruteForce(int[][] A, int X) {
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[row].length; col++) {
                if (A[row][col] == X) {
                    return true;
                }
            }
        }

        return false;
    }

    // O(Nlog(M))
    public static boolean findXInMatrixBinarySearch(int[][] A, int X) {
        for (int row = 0; row < A.length; row++) {
            //apply binary search to A[row]
            int left = 0;
            int right = A.length - 1;
            while (left <= right) {
                int middle = left + (right-left)/2;
                if (A[row][middle] < X) {
                    left = middle+1;
                } else if (A[row][middle] > X) {
                    right = middle-1;
                } else {
                    return true;
                }
            }
        }

        return false;
    }

    // O(N+M)
    public static boolean findXInMatrixOptimized(int[][] A, int X) {
        for (int row=0; row<A.length; row++) {
            int col=A[row].length-1;
            if (A[row][col] == X) {
                return true;
            } else if (A[row][col] < X) {
                col--;
            }
        }
        return false;
    }
}
