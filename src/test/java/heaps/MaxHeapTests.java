package heaps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxHeapTests {

    @Test
    public void maxHeapifyTest() {
        MaxHeap heap = new MaxHeap();
        heap.setHeap(new int[]{1, 14, 10, 8, 7, 9, 3, 2, 4, 6});
        heap.setHeapSize(heap.getHeap().length);
        heap.maxHeapify(heap.getHeap(), 0);

        int[] exp = {14, 8, 10, 4, 7, 9, 3, 2, 1, 6 };
        Assertions.assertArrayEquals(heap.getHeap(), exp);
    }
}
