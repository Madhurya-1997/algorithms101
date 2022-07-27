package arrays;


import java.util.HashMap;
import java.util.Map;

/**
 * find the number occurring odd number of times in an array.
 * Every other element has occurred twice but only 1 element
 * occurred odd number of times
 */
public class NumberOccurringOddTimes {

    // XOR operation approach
    public static int numberOccurringOddTimes(int[] arr) {
        int result = 0;
        for (int i=0; i<arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }


    // Hashmap approach
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
