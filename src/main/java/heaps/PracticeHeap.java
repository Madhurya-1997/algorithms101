package heaps;

import java.lang.reflect.Array;
import java.util.*;

class HeapNode {
    int data;
    int arrIdx;
    int nextIdx;
    HeapNode(int data, int arrIdx, int nextIdx) {
        this.data = data;
        this.arrIdx = arrIdx;
        this.nextIdx = nextIdx;
    }
}

public class PracticeHeap {
    public static void main(String[] args) {
        System.out.println((double)(2 + 3)/2);
    }

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

    /**
     * Given an integer array arr and an integer K,
     * return the K most frequent elements.
     * You may return the answer in any order
     *
     * Input: arr={1,1,2,1,3,2,}, K=2
     * Output: {1, 2}
     */
    public static int[] topKFrequencies(int[] arr, int K) {
        int[] res = new int[K];
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> freq = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            map.put(arr[i], 1 + map.getOrDefault(arr[i], 0));
        }
        for (int i=0; i<arr.length + 1; i++) {
            freq.add(new ArrayList<>());
        }

        for (Integer element: map.keySet()) {
            freq.get(map.get(element)).add(element);
        }


        int count=0;
        for (int i=freq.size()-1; i>=0; i--) {
            for (int val: freq.get(i)) {
                count++;

                int j=0;
                while (j<K) {
                    res[j] = val;
                    j++;
                }
            }
            if (count == K) { break;}
        }

        return res;
    }

    /**
     * Given K-sorted arrays of size N each, merge them
     *
     * Method 1:
     * 1. use merge sort algo to merge all K sorted lists
     *
     * Method 2:
     * 1. create min heap using all the first elements of each list
     * 2. apply deleteMin to the min heap
     * 3. keep track of the pointer to the deleted min value
     */
    private static void minHeapifyWithNode(HeapNode[] heap, int idx, int size) {
        int leastIdx;
        int leftIdx = 2*idx + 1;
        int rightIdx = 2*idx + 2;
        if (leftIdx < size && heap[leftIdx].data < heap[idx].data) {
            leastIdx = leftIdx;
        } else {
            leastIdx = idx;
        }

        if (rightIdx < size && heap[rightIdx].data < heap[leastIdx].data) {
            leastIdx = rightIdx;
        }

        if (leastIdx != idx) {
            swapWithHeapNode(heap, idx, leastIdx);
            minHeapifyWithNode(heap, leastIdx, size);
        }
    }
    private static void swapWithHeapNode(HeapNode[] heap, int i, int j) {
        HeapNode temp = heap[j];
        heap[j] = heap[i];
        heap[i] = temp;
    }
    public static int[] mergeKSortedArrays(int[][] list, int K, int N) {
        int[] res = new int[N*K];

        HeapNode[] heap = new HeapNode[K];

        // create the min heap
        for (int i=0; i<list.length; i++) {
            heap[i] = new HeapNode(list[i][0], i, 0);
        }
        for (int i=heap.length/2 - 1; i>=0; i--) {
            minHeapifyWithNode(heap, i, K);
        }

        // deleteMin
        for (int i=0; i<res.length; i++) {
            HeapNode root = heap[0];
            res[i] = root.data;

            if (root.nextIdx + 1 < list[root.arrIdx].length) {
                root.data = list[root.arrIdx][root.nextIdx + 1];
                root.nextIdx += 1;
            } else {
                root.data = Integer.MAX_VALUE;
            }

            heap[0] = new HeapNode(root.data, root.arrIdx, root.nextIdx);
            minHeapifyWithNode(heap, 0, K);
        }
        return res;
    }

    /**
     * Given k-sorted lists,
     * find the minimum range to which at least
     * one number belongs from every list.
     */
    public static int[] findSmallestRangeFromKSortedLists(int[][] list, int K, int N) {
        int start=0,end=0; // range
        HeapNode[] heap = new HeapNode[K];

        int max=Integer.MIN_VALUE; // keep track of the max value while inserting a new element into the min heap

        // min heap build prep starts
        for (int i=0; i<K; i++) {
            heap[i].data = list[i][0];
            heap[i].arrIdx = i;
            heap[i].nextIdx = 0;

            if (heap[i].data > max) {
                max = heap[i].data;
            }
        }
        for (int i=heap.length/2 - 1; i>=0; i--) {
            minHeapifyWithNode(heap, i, K);
        }
        // min heap build prep end

        return new int[]{1};
    }

}
