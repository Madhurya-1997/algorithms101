package arrays;


import java.util.*;

/**
 * Given an array A
 * and a number X,
 * find a pair (a,b) in A
 * such that a+b=X
 */
public class SumOfArrayElementsEqualsGivenNumber {


    /**
     * @param arr
     * @param X
     * @return array of pairs whose sum equals X
     */
//    public static int[][] getPairsOfArrayNumbersBruteForce(int[] arr, int X) {
//        {1, 2, 3, 4, 5}, 5 => {{2, 3}, {1, 4}}
//
//        int capacity = arr.length;
//        /**
//         * Brute Force Approach
//         */
//        ArrayList<Integer[]> result = new ArrayList<>();
//
//        for (int i = 0; i < capacity; i++) {
//            int a = arr[i];
//
//            for (int j = i; j < capacity; j++) {
//                if (X - a == arr[j]) {
//                    Integer[] pair = {a, arr[j]};
//                    result.add(pair);
//                }
//            }
//        }
//        return result;
//    }


    /**
     * Optimized approach
     */
    public static int[][] getPairsOfArrayNumbers(int[] arr, int X) {
//        ArrayList<Integer[]> result = new ArrayList<>();
        int capacity = arr.length;
        int[][] result = new int[2][capacity];
        int numOfPairs = 0;
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < capacity; i++) {
            int a = X - arr[i];
            if (!hashSet.contains(a)) {
                hashSet.add(a);
            } else {
                result[numOfPairs] = new int[]{arr[i], a};
                numOfPairs++;
            }
        }

        return result;
    }
}
