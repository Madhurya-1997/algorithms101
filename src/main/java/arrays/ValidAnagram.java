package arrays;

import java.util.*;
import java.util.stream.Collectors;

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


    /**
     * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
     *
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     *
     * @param strs
     * @return
     *
     *
     *
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     *
     * Input: strs = [""]
     * Output: [[""]]
     *
     *
     * Input: strs = ["a"]
     * Output: [["a"]]
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<List<Integer>, List<String>> map = new HashMap<>();
        //key: ['1a','1e','1t']
        //value: [ate, eat, tea]

        for (String str: strs) {
            char[] strArray = str.toCharArray();
            int[] count = new int[26]; // ['1a', 0, 0, 0, '1e', ....]

            for( int i=0; i<strArray.length; i++) {
                count[strArray[i] - 'a'] += 1;
            }

            List<Integer> countInt = Arrays.stream(count).boxed().collect(Collectors.toList());
            List<String> anagrams = new ArrayList<>();
            if (map.containsKey(countInt)) {
                List<String> values = map.get(countInt);
                values.add(str);
                map.put(countInt, values);
            } else {
                anagrams.add(str);
                map.put(countInt, anagrams);
            }
        }

        for (Map.Entry<List<Integer>, List<String>> entry: map.entrySet()) {
            res.add(entry.getValue());
        }

        return res;
    }
}
