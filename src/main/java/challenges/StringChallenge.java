package challenges;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class StringChallenge {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(twoSum(nums, 9));
//        System.out.println(isAlphaNum(','));
    }

    public static int[] twoSum(int[] nums, int target) {
        // val : index
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !isAlphaNum(s.charAt(left))) {
                left = left + 1;
            }
            while (left < right && !isAlphaNum(s.charAt(right))) {
                right = right - 1;
            }

            if (s.charAt(left) != s.charAt(right) ) {
                return false;
            }
            left+=1;
            right-=1;
        }

        return true;

    }
    private static boolean isAlphaNum(char c) {
        int ch = Character.getNumericValue(c);
        return (Character.getNumericValue('A') <= ch && ch <= Character.getNumericValue('Z')) ||
                (Character.getNumericValue('a') <= ch && ch <= Character.getNumericValue('z')) ||
                (Character.getNumericValue('0') <= ch && ch <= Character.getNumericValue('9'));
    }


//    public String urlify(String url) {
//
//        char[] urlChars = url.toCharArray();
//
//        for (int i=0; i<urlChars.length; i++) {
//            if (urlChars[i] == ' ') {
//
//            }
//        }
//
//    }
}
