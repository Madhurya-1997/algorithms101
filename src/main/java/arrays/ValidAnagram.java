package arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s1, String s2) {
        int[] count = new int[26];
        if (s1.length() != s2.length()) return false;

        for (int i=0; i<s1.length(); i++) {
            count[s1.toLowerCase().charAt(i) - 'a'] += 1;
            count[s2.toLowerCase().charAt(i) - 'a'] -= 1;
        }

        for (int val: count) {
            if (val != 0) return false;
        }

        return true;
    }
}
