package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    /**
     * Given a non-empty array of integers, find the top k elements which have the highest frequency
     * in the array. If two numbers have the same frequency then the larger number should be given preference.
     *
     * N = 6
     * nums = {1,1,1,2,2,3}
     * k = 2
     * Output: {1, 2}
     *
     *
     * N = 8
     * nums = {1,1,2,2,3,3,3,4}
     * k = 2
     * Output: {3, 2}
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        int[] res = topK(nums, 2);
        for(int i:res) {
            System.out.print(i + " ");
        }
    }

    public static int[] topK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];

        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // {1, 1, 1, 1, 2, 2, 3}, k=2
        // {1: 4, 2: 2, 3: 1}

        List<List<Integer>> freq = new ArrayList<>();
        for (int i=0; i<=nums.length; i++) {
            freq.add(new ArrayList<>());
        }

        for (Integer el: map.keySet()) {
            int frequency = map.get(el);
            freq.get(frequency).add(el);
        }


        int count=0;
        for (int i=freq.size()-1; i>=1; i--) {
            if (count == k) {
                break;
            }

            for(; count<freq.get(i).size(); count++) {
                res[count] = freq.get(i).get(count);
            }
        }
        return res;
    }
}
