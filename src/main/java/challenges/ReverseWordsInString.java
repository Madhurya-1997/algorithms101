package challenges;

import java.util.Stack;

public class ReverseWordsInString {
    /**
     *  Given an input string s, reverse the order of the words.
     *
     * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
     *
     * Return a string of the words in reverse order concatenated by a single space.
     *
     * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
     *
     * "the sky is blue"
     * "blue is sky the"
     *
     *
     * "  hello world  "
     * "world hello"
     *
     *
     * "a good   example"
     * "example good a"
     */
    public static String reverseWords(String s) {

        Stack<String> stack = new Stack<>();
        String[] words = s.split(" ");
        for (String word: words) {
            if (!word.equals("")) {
                stack.push(word);
            }
        }

        String revS = "";
        while (!stack.isEmpty()) {
            if (!(stack.size() == 1)) {
                revS = revS + stack.pop() + " ";
            } else {
                revS = revS + stack.pop();
            }
        }
        return revS;
    }
}
