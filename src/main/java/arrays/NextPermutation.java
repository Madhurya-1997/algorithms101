package arrays;

import java.util.Arrays;

/**
 * A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
 *
 *     For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
 *
 * The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
 *
 *     For example, the next permutation of arr = [1,2,3] is [1,3,2].
 *     Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 *     While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
 *
 * Given an array of integers nums, find the next permutation of nums.
 *
 * The replacement must be in place and use only constant extra memory.
 *
 *
 *
 * ex.
 * input = [2,1,5,4,3,0,0]
 * output = [2,3,0,0,5,4,1]
 *
 */
public class NextPermutation {

    public static int[] nextPermutation(int[] nums) {
        int n=nums.length;
        int index = -1;

        //finding the breakpoint, excluding the last digit
        for (int i=n-1; i>0; i--) {
            if (nums[i] > nums[i-1]) {
                index = i-1;
                break;
            }
        }

        //edge case: if the given permutation is the last one
        if (index == -1) {
            reverse(nums, 0, n-1);
            return nums;
        }

        //finding the least among the numbers that are greater than nums[index]
        for (int i=n-1; i>index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        //reverse the remaining part of the array, after the breakpoint
        reverse(nums, index+1, n-1);
        return nums;
    }

    private static void swap(int[] ar, int i1, int i2) {
        int temp = ar[i1];
        ar[i1] = ar[i2];
        ar[i2] = temp;
        return;
    }

    private static void reverse(int[] a, int startIdx, int finalIdx) {
        int n=finalIdx - startIdx + 1;
        for (int i=startIdx; i<startIdx + n/2; i++) {
            swap(a, i, finalIdx + startIdx - i);
        }
    }
}
