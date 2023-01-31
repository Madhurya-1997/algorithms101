package arrays;

import java.util.Arrays;

public class LargestMultipleOf3 {
    /**
     * Given an array A, using the elements in the array, find the number that is
     * the largest multiple of 3
     */
    public static int largestMultipleOf3(int[] A) {
        Arrays.sort(A);
        int sum = Arrays.stream(A).sum();

        if (sum%3 == 0) {
            return convertIntArrayToNumber(A);
        } else if (sum%3 == 1) {
            // find the smallest number that will give us remainder 1 and remove it
            for (int i=0; i<A.length; i++) {
                if (A[i]%3 == 1) {

                }
            }

            // if there is no such element then remove 2 such elements that give us remainder 2
        } else if (sum%3 == 2) {
            // remove the smallest element whose remainder is 2 when it is divided by 2

            // remove 2 smallest elements whose remainder is 1 when it is divided by 1

        }
        return 1;
    }
    private static int convertIntArrayToNumber(int[] A) {
        int num = 0;
        for(int i=0; i<A.length; i++) {
            num = num + A[i]*(int)Math.pow(Double.valueOf(10), Double.valueOf(A.length-i-1));
        }
        return num;
    }
}
