package sorting;

public class QuickSort {

    public static int[] quickSort(int[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    private static int[] quickSort(int[] arr, int lowIndex, int highIndex) {
//        {1,8,3,9,4,5,7}

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


        if (lowIndex < highIndex){
            int pivot = arr[highIndex];

            // partition starts
            int left = lowIndex;
            int right = highIndex;

            while (left < right) {
                while (arr[left] <= pivot && left < right) {
                    left++;
                }
                while (arr[right] >= pivot && left < right) {
                    right--;
                }
                swap(arr[left], arr[right]);
            }
            // left == right when it comes out of the loop
            swap(arr[right], pivot);
            // partition ends

            quickSort(arr, lowIndex, right - 1);
            quickSort(arr, right + 1, arr.length - 1);
        }
        return arr;
    }


    private static void swap(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
    }
}
