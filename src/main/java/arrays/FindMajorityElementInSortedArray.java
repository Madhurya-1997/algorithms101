package arrays;

public class FindMajorityElementInSortedArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 2, 2, 3, 4};
        System.out.println(FindMajorityElementInSortedArray.findMajorityElementInSortedArraySolution1(A));
    }

    /**
     * Given a sorted array of length N, find an element occurring more than N/2 times
     *
     * Method 1:
     * a. check the ith and (i+N/2+1)th position in the array
     * b. if the two are same then return the element
     */
    public static int findMajorityElementInSortedArraySolution1(int[] A) {

        int res = -1;

        int i=0;
        while (i < A.length/2) {
            if (A[i] == A[i + A.length/2]) {
                res = A[i];
            }
            i++;
        }
        return res;
    }
}
