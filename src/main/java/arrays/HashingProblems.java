package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashingProblems {

    /**
     * check whether given array
     * contains duplicates in k-distance or not
     *
     * {5, 4, 2, 6, 1, 4}, k=3
     * returns true
     */
    public static boolean containsDuplicateInKDistance(int[] arr, int k) {
        // time complexity: O(nk)
        // space complexity: O(1)
        int start=0;
        int end=k+1;

        while (end < arr.length) {
            if (arr[start] == arr[end]) {
                return true;
            }


            start++;
            end++;
        }

        return false;
    }

    /**
     * check if two sets (in the form of arrays)
     * are disjoint
     *
     * Disjoint sets have no common elements.
     * Assume 2 arrays of sizes M and N.
     * Array of size M should not have any common
     * elements with the array of size N
     */
    public static boolean disjointSetsBruteForce(int[] a1, int a2[]) {
        for (int i=0; i<a1.length; i++) {
            for (int j=0; j<a2.length; j++) {
                if (a1[i] == a2[j]) {
                    return false;
                }
            }
        }
        return true;
    }


    /**
     * use hashing to optimize the quadratic solution
     *
     * Time complexity will be reduced to: O(n+m)
     * n: size of a1 & m: size of a2
     * Space complexity: O(n) or O(m)
     */
    public static boolean disjointSetsOptimized(int[] a1, int a2[]) {

        List<Integer> hash = new ArrayList<>();

        for (int i=0; i<a1.length; i++) {
            hash.add(a1[i]);
        }

        for (int i=0; i<a2.length; i++) {
            if (hash.contains(a2[i])) {
                return false;
            }
        }
        return true;

    }
}
