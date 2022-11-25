package heaps;

public class MaxHeap {
    int[] heap;
    int heapSize; // no of nodes in the binary heap or no of elements in the heap array

    public int getHeapSize() {
        return heapSize;
    }

    public int[] getHeap() {
        return heap;
    }

    public void setHeap(int[] heap) {
        this.heap = heap;
    }

    public void setHeapSize(int heapSize) {
        this.heapSize = heapSize;
    }

    public void maxHeapify(int[] A, int i) {
        int largestIdx = Integer.MIN_VALUE;

        int leftIdx = 2*i + 1;
        int rightIdx = 2*i + 2;

        if (leftIdx < 10 && A[i] < A[leftIdx]) {
            largestIdx = leftIdx;
        } else {
            largestIdx = i;
        }

        if (rightIdx < 10 && A[largestIdx] < A[rightIdx]) {
            largestIdx = rightIdx;
        }

        if (largestIdx != i) {
            swap(A, i, largestIdx);
            maxHeapify(A, largestIdx);
        }
    }

    public void buildMaxHeap(int[] A){

    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
