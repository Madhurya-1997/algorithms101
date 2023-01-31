package arrays;

public class ImageRotation {

    /**
     * Rotate a square matrix anticlockwise by 90 deg
     *
     * 1. reverse each row
     * 2. take the transpose
     *
     */
    public static int[][] rotateAnticlockwiseBy90(int[][] mat) {
//            {{1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}}

//            {{3, 6, 9},
//            {2, 5, 8},
//            {1, 4, 7}}

        // {{1, 2, 3, 4}, ...}
        // {{4, 3, 2, 1}, ...}


        // first reverse each row -> O(n^2)
        reverseEachRow(mat);
        // then take transpose -> O(n^2)
        transpose(mat);
        return mat;
    }

    private static void reverseEachRow(int[][] arr) {
        for (int row=0; row<arr.length; row++) {
            for (int col=0, k=arr[0].length-1; col<k; col++, k--) {
                swap(arr, row, row, col, k);
            }
        }
    }

    private static void transpose(int[][] arr) {
        // a[i][j] = a[j][i]
        for (int row=0; row<arr.length; row++) {
            for (int col=row; col<arr[0].length; col++) {
                swap(arr, row, col, col, row);
            }
        }
    }

    private static void swap(int[][] arr, int oldRowIdx, int newRowIdx, int oldColIdx, int newColIdx) {
        int temp = arr[newRowIdx][newColIdx];
        arr[newRowIdx][newColIdx] = arr[oldRowIdx][oldColIdx];
        arr[oldRowIdx][oldColIdx] = temp;
        return;
    }

    public static void printMatrix(int[][] mat) {
        for (int row=0; row<mat.length; row++) {
            for (int col=0; col<mat[0].length; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }

}
