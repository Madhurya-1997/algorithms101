package arrays;

import java.util.*;

/**
 * Given an array A and an integer K, find the maximum element for each and every contiguous
 * sub array of size K
 */
public class MaximumSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int[] res = maxSlidingWindowUsingMaxHeap(arr, 3);

        Deque<Integer> q = new LinkedList<>();
        q.addLast(12);
        q.addLast(23);
        System.out.println(q.peek());
        System.out.println(q.add(23));
        System.out.println(q.peekLast());

        System.out.println(q.contains(12));
        for(int i:res) {
            System.out.print(i + " ");
        }
    }

    public static int[] maxSlidingWindow(int[] A, int K) {
        Deque<Integer> Q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        for (int i=0; i<K; i++) {

        }



        return new int[]{1};
    }


    public static int[] maxSlidingWindowUsingMaxHeap(int[] nums, int k) {
        int left=0;
        int right=left+k-1;

        List<Integer> result = new ArrayList<>();

        while (right < nums.length) {
            // create max heap for every sliding window
            int[] temp = new int[k];
            for (int i=0; i<temp.length; i++) {
                temp[i] = nums[i+left];
            }
            buildMaxHeap(temp);

            // delete the root from every heap created
            result.add(deleteRoot(temp, temp.length));

            // shift the sliding window
            left++;
            right++;
        }



        int[] ans = new int[result.size()];
        for (int i=0; i<ans.length; i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }

    private static int deleteRoot(int[] heap, int size) {
        int deleted = heap[0];
        heap[0] = heap[size-1];
        size = size-1;
        maxHeapify(heap, 0, size);

        return deleted;
    }

    private static void buildMaxHeap(int[] arr) {
        for (int i=arr.length/2-1; i>=0; i--) {
            maxHeapify(arr, i, arr.length);
        }
    }
    private static void maxHeapify(int[] arr, int idx, int size) {
        int largestIdx;
        int leftIdx=2*idx+1;
        int rightIdx=2*idx+2;

        if (leftIdx < size && arr[leftIdx] > arr[idx]) {
            largestIdx = leftIdx;
        } else {
            largestIdx = idx;
        }

        if (rightIdx < size && arr[rightIdx] > arr[largestIdx]) {
            largestIdx = rightIdx;
        }

        if (largestIdx != idx) {
            swap(arr, largestIdx, idx);
            maxHeapify(arr, largestIdx, size);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
