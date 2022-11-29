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
        setHeapSize(A.length);
        int largestIdx = Integer.MIN_VALUE;

        int leftIdx = 2*i + 1;
        int rightIdx = 2*i + 2;

        if (leftIdx < getHeapSize() && A[i] < A[leftIdx]) {
            largestIdx = leftIdx;
        } else {
            largestIdx = i;
        }

        if (rightIdx < getHeapSize() && A[largestIdx] < A[rightIdx]) {
            largestIdx = rightIdx;
        }

        if (largestIdx != i) {
            swap(A, i, largestIdx);
            maxHeapify(A, largestIdx);
        }
    }

    public void buildMaxHeap(int[] A){
        for (int i = (int)Math.floor(A.length/2) - 1; i>=0; i--) {
            maxHeapify(A, i);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
