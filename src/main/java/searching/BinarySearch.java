package searching;

public class BinarySearch {

    /**
     * when array is sorted in ascending order
     * @param arr
     * @param target
     * @return
     */

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right-left)/2;

            if ( target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else{
                return true;
            }
        }
        return false;
    }

    /**
     * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
     *
     * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
     */

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum > target) {
                right = right - 1;
            } else if (sum < target){
                left = left + 1;
            } else {
                result[0] = left;
                result[1] = right;
                break;
            }
        }
        return result;
    }
}
