package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindXFromMatrixTest {
    @Test
    public void findXInMatrixBruteForceTest() {
        int[][] M = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Assertions.assertTrue(FindXFromMatrix.findXInMatrixBruteForce(M, 7));
    }

    @Test
    public void findXInMatrixBinarySearchTest() {
        int[][] M = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Assertions.assertTrue(FindXFromMatrix.findXInMatrixBinarySearch(M, 6));
    }

    @Test
    public void findXInMatrixOptimizedTest() {
        int[][] M = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        Assertions.assertTrue(FindXFromMatrix.findXInMatrixOptimized(M, 9));
    }
}
