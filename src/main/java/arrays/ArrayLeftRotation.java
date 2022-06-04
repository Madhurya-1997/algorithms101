package arrays;


/**
 * A left rotation operation on an array
 * shifts each of the array's elements
 * given integer n unit to the left.
 * {1, 2, 3, 4, 5}
 * Left Rotation by 2 will give us
 * {3, 4, 5, 1, 2}
 */

public class ArrayLeftRotation {

    public static int[] leftRotate(int[] data, int N) {
        int capacity = data.length;
        int[] result = new int[capacity];
        N = N % capacity;

        for (int i=0; i<capacity; i++) {
            result[i] = data[N];
            N = (N+1) % capacity;
        }

        return result;
    }
}
