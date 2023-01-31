package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    /**
     * Find the number of subarrays with sum 0
     *
     * {11, 10, -5, -3, -2, 10, 5, -1, -6}
     * answer = 2
     */
    public static int numOfSubArraysWithSumZero(int[] arr) {
        List<Integer> cumSum = new ArrayList<>();
        int sum=0;
        int numOfSubArray=0;
        for (int i=0; i<arr.length; i++) {
            sum+=arr[i];
            if (cumSum.contains(sum)) {
                numOfSubArray++;
            }
            cumSum.add(sum);
        }
        return numOfSubArray;
    }

    /**
     * Fina the set of 4 elements i,j,k,l in an array such that i+j=k+l
     *
     * {6,2,3,4,5}
     * answer = {((6,2),(3,5)),((6,3),(4,5)),((2,5),(3,4))}
     */
    public static void findingSetOf4Elements(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
    }

}
