package arrays;


/**
 * This algorithm is used to find the maximum sum of subarray.
 *
 * Find the sum of contiguous sub array
 * within a 1-D array of numbers
 * that has the largest sum
 */
public class KadaneAlgorithm {
    /**
     * Initialize:
     *      max_so_far = INT_MIN
     *      max_ending_here = 0
     *
     * Loop for each element of array
     *      1. max_ending_here = max_ending_here + a[i]
     *      2. if (max_so_far < max_ending_here)
     *          max_so_far = max_ending_here
     *      3. if (max_ending_here < 0)
     *          max_ending_here = 0
     *
     *  return max_so_far
     *
     *
     *
     *  The simple idea of Kadane’s algorithm is
     *  to look for all positive contiguous segments
     *  of the array (max_ending_here is used for this).
     *  And keep track of maximum sum contiguous segment
     *  among all positive segments (max_so_far is used for this).
     *  Each time we get a positive sum
     *  compare it with max_so_far and
     *  update max_so_far if it is greater than max_so_far
     */


    // {-2,-3,4,-1,-2,1,5,-3}
    public static int maxSumOfSubArray(int[] arr) {

        if (arr == null || arr.length == 0) return 0;


        // maxSoFar is to find the actual max sum so far for the corresponding subarray
        int maxSoFar = Integer.MIN_VALUE;

        // maxEndingHere is to find the start of the max sum subarray location
        int maxEndingHere = 0;
        for (int i=0; i<arr.length; i++) {
            maxEndingHere += arr[i];
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                // this is where the subArray's starting location changes
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }


    public static int[] maxSumSubArray(int[] arr) {
        int maxSumSoFar = 0;
        int currentSum = 0;
        int lastIdx = -1;
        int startIdx = -1;

        for (int i=0; i<arr.length; i++) {
            currentSum += arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            if (currentSum > maxSumSoFar) {
                maxSumSoFar = currentSum;
                lastIdx = i;
            }
        }

        int sum=0;
        for (int i=lastIdx; i>=0; i--) {
            sum += arr[i];
            if (sum == maxSumSoFar) {
                startIdx = i;
                break;
            }
        }


        int[] result = new int[lastIdx-startIdx+1];
        for (int i=0; i<=lastIdx-startIdx; i++) {
            result[i] = arr[i+startIdx];
        }

        return result;
    }
}
