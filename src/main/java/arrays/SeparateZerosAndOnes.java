package arrays;


/**
 * Separate 0s and 1s in an array,
 * assuming the array only has 0s and 1s
 */
public class SeparateZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,0};
        int[] result = separate(arr);

        for (int i: result){
            System.out.println(i);
        }
    }

    /**
     * This approach is identical to a quick sort algorithm
     *
     * create 2 pointers pointing at arr[0] = left and arr[arr.length-1] = right
     * move left pointer to the right until you get a 1
     * move right pointer to the left until you get a 0
     *
     * the operation will stop when left pointer > right pointer
     */
    public static int[] separate(int[] arr){
        // {0,1,1,0,1,1,0}
        // {0,0,1,1,1,1,0}
        int N=arr.length;
        int left=0;
        int right=N - 2;
        int pivot = arr[N - 1];

        while (left < right-1) {

            while(arr[left] == pivot && left < right) {
                left++;
            }
            while(arr[right] != pivot && left < right-1) {
                right--;
            }
            if (left < right-1) {
                swap(arr, left, right);
            }
        }
        swap(arr, right, pivot);
        return arr;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
