package heaps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PracticeHeapTests {
    @Test
    public void findMaximumElementInMinHeapTest() {
        int[] heap = {1, 2, 3, 4, 5, 6, 7};
        int exp = PracticeHeap.findMaximumElementInMinHeap(heap);
        Assertions.assertEquals(exp, 7);
    }

    @Test
    public void deleteArbitraryElementFromMinHeapTest() {
        int[] heap = {1, 2, 3, 4, 5, 6, 7};
        PracticeHeap.deleteArbitraryElementFromMinHeap(heap, 2);
    }

    @Test
    public void findKLargestElementsFromArrayTest() {
        int[] heap = {23, 35, 20, 4, 3, 22, 21};
        int[] exp = PracticeHeap.findKLargestElementsFromArray(heap, 2);

        for (int i=0; i<exp.length; i++) {
            System.out.print(exp[i] + " ");
        }
    }

    @Test
    public void topKFrequenciesTest() {
        int[] input = {1, 1, 1, 1, 2, 2, 10};
        int[] exp = PracticeHeap.topKFrequencies(input, 2);
        Assertions.assertArrayEquals(exp, new int[]{1, 2});
    }
}
