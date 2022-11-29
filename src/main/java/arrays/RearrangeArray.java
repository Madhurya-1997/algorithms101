package arrays;

public class RearrangeArray {

    /**
     * Rearrange the array such that a[i] becomes a[a[i]]
     *
     * A = {3, 1, 0, 2, 4}
     * A should be {A[3], A[1], A[0], A[2], A[4]} = {2, 1, 3, 0, 4}
     */

    public static int[] rearrange(int[] arr) {
        // all val inside arr should be positive, in arr[arr[i]], arr[i] cant be negative
        for (int val: arr) {
            if (val < 0) { throw new RuntimeException("Values in array should be non negative"); };
        }

        int[] temp = new int[arr.length];

        for (int i=0; i<arr.length; i++) {
            int rearrangedVal = arr[arr[i]];
            temp[i] = rearrangedVal;
        }

        for (int i=0; i<temp.length; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }

    public static int[] rearrangeOpt(int[] arr) {
        // all val of arr have values from 0 to N - 1
        // use the concept of a + bN
        // to get a by (a + bN)%N
        // and b by (a + bN)/N

        final int N = arr.length;
        for (int i=0; i<arr.length; i++) {
            arr[i] = arr[i] + (arr[arr[i]]%N)*N;
        }

        for (int i=0; i<arr.length; i++) {
            arr[i] = arr[i] / N;
        }

        return arr;
    }

    public static int[] rearrangeOpt2(int[] arr) {
        // all val of arr have values from 0 to N - 1
        // use the concept of a + bN
        // to get a by (a + bN)%N
        // and b by (a + bN)/N

        final int N = arr.length;
        for (int i=0; i<arr.length; i++) {
            arr[i] = arr[i] + (arr[arr[i]]%N)*N;
        }

        for (int i=0; i<arr.length; i++) {
            arr[i] = arr[i] / N;
        }

        return arr;
    }


    public static void printArr(int[] arr) {
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }
}
