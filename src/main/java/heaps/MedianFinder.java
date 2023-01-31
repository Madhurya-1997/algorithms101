package heaps;

import java.util.ArrayList;
import java.util.List;

class MedianFinder {
    List<Integer> list;
    private List<Integer> maxHeap = new ArrayList<>();
    private List<Integer> minHeap = new ArrayList<>();

    public MedianFinder() {
        list = new ArrayList<>();
    }

    private void minHeapify(List<Integer> minHeap, int idx) {
        int leastIdx;
        int leftIdx = 2*idx + 1;
        int rightIdx = 2*idx + 2;
        if (leftIdx < minHeap.size() && minHeap.get(leftIdx) < minHeap.get(idx)) {
            leastIdx = leftIdx;
        } else {
            leastIdx = idx;
        }

        if (rightIdx < minHeap.size() && minHeap.get(rightIdx) < minHeap.get(leastIdx)) {
            leastIdx = rightIdx;
        }

        if (leastIdx != idx) {
            swap(minHeap, idx, leastIdx);
            minHeapify(minHeap, leastIdx);
        }
    }
    private void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    private void maxHeapify(List<Integer> maxHeap, int idx) {
        int largestIdx;
        int leftIdx = 2*idx + 1;
        int rightIdx = 2*idx + 2;
        if (leftIdx < maxHeap.size() && maxHeap.get(leftIdx) > maxHeap.get(idx)) {
            largestIdx = leftIdx;
        } else {
            largestIdx = idx;
        }

        if (rightIdx < maxHeap.size() && maxHeap.get(rightIdx) > maxHeap.get(largestIdx)) {
            largestIdx = rightIdx;
        }

        if (largestIdx != idx) {
            swap(maxHeap, idx, largestIdx);
            maxHeapify(maxHeap, largestIdx);
        }
    }

    private void rearrangeByBalancing(List<Integer> heap, int diff) {
        if (diff > 1) {
            // delete max
            int root = maxHeap.get(0);
            maxHeap.set(0, maxHeap.get(maxHeap.size() - 1));
            this.maxHeapify(maxHeap, 0);
            // insert max into min heap
            minHeap.add(root);
            this.minHeapify(minHeap, 0);
        }
        return;
    }

    public void addNum(int num) {
        list.add(num);
        // create 2 heaps - max and min
        if (maxHeap.isEmpty() && minHeap.isEmpty()) {
            maxHeap.add(num);
            minHeap.add(Integer.MAX_VALUE);
            return;
        } else {

            if (num <= (int)maxHeap.get(0)) {
                maxHeap.add(num);
                rearrangeByBalancing(maxHeap, Math.abs(maxHeap.size() - minHeap.size()));
                return;
            }

            if (num > (int)maxHeap.get(0)) {
                minHeap.add(num);
                rearrangeByBalancing(minHeap, Math.abs(maxHeap.size() - minHeap.size()));
                return;
            }
        }
    }

    public double findMedian() {
        double result = 0f;
        if (list.size()%2 == 0) {
            result = (double)((maxHeap.get(0) + minHeap.get(0))/2);
        } else {
            if (maxHeap.size() > minHeap.size()) {
                result = maxHeap.get(0);
            } else {
                result = minHeap.get(0);
            }
        }

        return result;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
