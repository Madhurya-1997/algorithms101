package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImageRotationTests {
    private static final Integer ROWS = 4;
    private static final Integer COLS = 4;


    private int[][] mat4;
    private int[][] mat3;


    @BeforeEach
    public void setup() {
        mat4 = new int[][]{{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        mat3 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
    }

    @Test
    public void rotateMat4AnticlockwiseBy90Test() {
        int[][] rotatedMat = ImageRotation.rotateAnticlockwiseBy90(mat4);
        int[][] actualRotatedMat = new int[][]{{4, 8, 12, 16}, {3, 7, 11, 15}, {2, 6, 10, 14}, {1, 5, 9, 13}};
        ImageRotation.printMatrix(rotatedMat);
        ImageRotation.printMatrix(actualRotatedMat);
    }

    @Test
    public void rotateMat3AnticlockwiseBy90Test() {
        int[][] rotatedMat = ImageRotation.rotateAnticlockwiseBy90(mat3);
        int[][] actualRotatedMat = new int[][]{{3, 6, 9},
                {2, 5, 8},
                {1, 4, 7}};
        ImageRotation.printMatrix(rotatedMat);
        ImageRotation.printMatrix(actualRotatedMat);
    }

}
