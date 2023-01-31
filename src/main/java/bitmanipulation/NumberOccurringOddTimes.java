package bitmanipulation;

import java.util.HashMap;
import java.util.Map;

public class NumberOccurringOddTimes {
    /**
     * Find the number occurring odd number of times in an array,
     * assuming exactly one number occurs odd times
     *
     * Method 1: Bit wise operation
     */
    public static int numberOccurringOddTimes(int[] arr) {
        int res = 0;
        for(int i=0; i<arr.length; i++){
            res = res^arr[i];
        }
        return res;
    }

    /**
     * Find the number occurring odd number of times in an array,
     * assuming exactly one number occurs odd times
     * Method 2: => Time: O(N) & Space: O(N)
     * a. use hashmap to store frequencies of each element
     * b. return the key for which frequency is odd
     */

    public static int numberOccurringOddTimesHash(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i=0; i<arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() % 2 != 0){
                result = entry.getKey();
            }
        }
        return result;
    }
}
