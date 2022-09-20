package sorting;

public class QuickSort {

//    {9, 6, 5, 0, 8, 2, 4, 7}
    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, pivotIndex-1);
            quickSort(arr, pivotIndex + 1, endIndex);
        }
    }


    /**
     * returns the index of the pivot element after it reaches its correct position
     * @param arr
     * @param lowIndex
     * @param highIndex
     * @return
     */
    private static int partition(int[] arr, int lowIndex, int highIndex) {
        /**
         * step - 1: Choose a pivot (last element)
         *
         * step - 2: All elements lesser than pivot should be on its left
         * and all elements greater than pivot should be to the right of pivot
         *
         * step - 3: once all the elements are places, the pivot takes its final place in the array
         *
         * step - 4: repeat the same above 3 steps for
         * the sub array before the pivot
         * and the sub array after the pivot
         */

        int pivot = arr[highIndex];

        int i=-1;

        for (int j=0; j <= highIndex - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, highIndex);

        return i+1;
    }


    public static void swap(int[] arr, int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
