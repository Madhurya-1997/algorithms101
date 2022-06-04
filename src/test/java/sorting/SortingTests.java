package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingTests {

    @Test
    public void selectionSortTest() {
        int[] arr = {64, 25, 12, 22, 11};
        int[] sortedArr = SelectionSort.selectionSort(arr);
        int[] actualArr = {11, 12, 22, 25, 64};

        Assertions.assertArrayEquals(sortedArr, actualArr);
    }

    @Test
    public void bubbleSortTest() {
        int[] arr = {64, 25, 12, 22, 11};
        int[] sortedArr = BubbleSort.bubbleSort(arr);
        int[] actualArr = {11, 12, 22, 25, 64};

        Assertions.assertArrayEquals(sortedArr, actualArr);
    }
}