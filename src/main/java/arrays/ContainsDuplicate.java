package arrays;

import java.util.ArrayList;
import java.util.List;

public class ContainsDuplicate {

    public static boolean containsDuplicate1(int[] nums) {
        if (nums == null || nums.length == 0) return false;

        List<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<nums.length; i++) {
            if (list.contains(nums[i])) {
                return true;
            }
            list.add(nums[i]);
        }

        return false;
    }
}
