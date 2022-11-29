package heaps;

import java.util.Arrays;

public class PracticeHeap {

    /**
     * Given a min heap, find the max element in the min heap
     * @param heap
     * @return
     */
    public static int findMaximumElementInMinHeap(int[] heap) {
        // {1, 2, 3, 4, 5, 6, 7}
        int leafStartIdx = (int)(Math.floor(heap.length / 2) - 1);
        int leafEndIdx = heap.length - 1;

        int max = heap[leafStartIdx];
        for (int i=leafStartIdx+1; i<=leafEndIdx; i++) {
            if (heap[i] > max) {
                max = heap[i];
            }
        }
        return max;
    }

    /**
     * delete an arbitrary element from a min heap
     */
    public static void deleteArbitraryElementFromMinHeap(int[] heap, int target) {
        deleteArbitraryElementFromMinHeapUtil(heap, heap.length, target);
    }
    private static void deleteArbitraryElementFromMinHeapUtil(int[] heap, int size, int target) {
        int idx;

        // search for the element in the heap
        for (idx=0; idx<size; idx++) {
            if (heap[idx] == target) {
                // break from the loop and store the index value
                break;
            }
        }

        // if idx is within the current size of heap
        if(idx < size) {
            // swap the target with the last element in the heap
            heap[idx] = heap[size - 1];

            // decrease the size by 1
            size = size - 1;
            heap = Arrays.copyOf(heap, size);

            // apply minHeapify
            minHeapify(heap, idx, size);
        }
    }

    private static void minHeapify(int[] heap, int idx, int size) {
        int leastIdx;
        int leftIdx = 2*idx + 1;
        int rightIdx = 2*idx + 2;
        if (leftIdx < size && heap[leftIdx] < heap[idx]) {
            leastIdx = leftIdx;
        } else {
            leastIdx = idx;
        }

        if (rightIdx < size && heap[rightIdx] < heap[leastIdx]) {
            leastIdx = rightIdx;
        }

        if (leastIdx != idx) {
            swap(heap, idx, leastIdx);
            minHeapify(heap, leastIdx, size);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printHeap(int[] heap) {
        for (int val: heap) {
            System.out.print(val + " ");
        }
    }

    private static void maxHeapify(int[] heap, int idx, int size) {
        int largestIdx;
        int leftIdx = 2*idx + 1;
        int rightIdx = 2*idx + 2;
        if (leftIdx < size && heap[leftIdx] > heap[idx]) {
            largestIdx = leftIdx;
        } else {
            largestIdx = idx;
        }

        if (rightIdx < size && heap[rightIdx] > heap[largestIdx]) {
            largestIdx = rightIdx;
        }

        if (largestIdx != idx) {
            swap(heap, idx, largestIdx);
            maxHeapify(heap, largestIdx, size);
        }
    }


    /**
     * find k-largest elements from an array
     *
     * Method 1: sort in any order and choose the first/last K elements => O(NlogN)
     * Method 2:
     * a. create Max Heap from the given array => O(N)
     * b. delete the max element from the max heap and insert it in a result array and apply maxHeapify on the updated array => O(logN)
     * Method 3: O(NlogK)
     * a. create min heap from the 1st K elements from the given array => O(K)
     * b. compare the min element with the remaining (n-K) elements in the array
     * c. if the min element < remaining (n-K) elements in the array, then swap the two and apply minHeapify on the updated min heap
     * d. the final min heap will contain the K largest elements
     */
    public static int[] findKLargestElementsFromArray(int[] arr, int K) { // method 2
        int N = arr.length;
        int[] res = new int[K];

        // build a max heap => O(N)
        for (int i=(int)Math.floor(N/2) - 1; i>=0; i--) {
            maxHeapify(arr, i, N);
        }

        // for k times => delete the max element => O(KlogN)
        for (int i=0; i<K; i++) {
            int val = arr[0];
            swap(arr, 0, N-1);
            N--;
            arr = Arrays.copyOf(arr, N);
            maxHeapify(arr, 0, N);

            res[i] = val;
        }

        return res;
    }

    /**
     * Print out all the numbers of the form a^3+b^3 where a and b are integers
     * between 0 and N in sorted order
     */
    public static int[] printAllNumbersInGivenForm(int N) {
        int[] result = new int[(int)Math.pow((int)N+1, 2)];

        for (int row=0; row<=N; row++) {
            for(int col=0; col<=N; col++) {
                int currentVal = (int)(Math.pow(row, 3) + Math.pow(col, 3));


            }
        }





        return result;
    }
}
