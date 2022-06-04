package sorting;

/**
 * Selection Sort algorithm sorts an array by repeatedly
 * finding the minimum element (considering ascending order)
 * from unsorted part and putting it at the beginning.
 * The algo maintains 2 subarrays in a given array:
 *
 * 1. the subarray which is already sorted
 *
 * 2. the subarray which is unsorted
 *
 * In every iteration of selection sort,
 * the minimum element (considering ascending order)
 * from the unsorted subarray is picked
 * and moved to the sorted subarray.
 *
 * Time complexity: O(n*n)
 * Space complexity: O(1)
 *
 */
public class SelectionSort {

    // [64, 25, 12, 22, 11]

    public static int[] selectionSort(int[] arr) {

        for (int i=0; i<arr.length; i++) {
            int minIdx = i;

            // traverse the remaining subarray to get the index for minimum element in that subarray
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // swap the found element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
