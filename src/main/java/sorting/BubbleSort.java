package sorting;


/**
 * Bubble Sort is the simplest sorting algorithm
 * that works by repeatedly swapping the
 * adjacent elements if they are in the
 * wrong order.
 * This algorithm is not suitable for large data sets
 * as its average and worst case time complexity is quite high.
 *
 * Time complexity: O(n*n)
 * Space complexity: O(1)
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
