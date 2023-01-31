package arrays;


/**
 * Separate 0s and 1s in an array,
 * assuming the array only has 0s and 1s
 */
public class SeparateZerosAndOnes {
    public static void main(String[] args) {
        System.out.println(0%2);
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
        int right=N - 1;

        while (left < right) {

            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }
            swap(arr, left, right);
            left++;
            right--;
        }
        return arr;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


    /**
     * Using even and odd number concept => another mock of partition algo of quick sort
     *
     * increase left by 1 until you get an odd number
     * decrease right by 1 until you get an even number
     *
     * this method also can be used to separate evens and odds
     */
    public static int[] separateUsingBitOperation(int[] arr) {
        int N = arr.length;
        int left = 0;
        int right = N-1;

        while (left < right) {
            while(arr[left]%2 == 0 && left < right) {
                left++;
            }
            while(arr[right]%2 == 1 && left < right) {
                right--;
            }
            swap(arr, left, right);
            left++;
            right--;
        }
        return arr;
    }
}
