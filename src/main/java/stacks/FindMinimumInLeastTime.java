package stacks;

import java.util.Stack;

/**
 * Design a Stack such that findMinimum() method runs in O(1)
 */
public class FindMinimumInLeastTime{
    private Stack<Integer> s1; // original stack
    private Stack<Integer> s2; // stack will store the minimum val found so far

    public FindMinimumInLeastTime(Stack<Integer> s1, Stack<Integer> s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    public int findMinimum() {
        return s2.peek();
    }

    public void pushValue(int val) {
        s1.push(val);
        Integer min;
        if (s1.size() == 1) {
            min = s1.peek();
            s2.push(val);
        } else {
            min = s2.peek();
        }

        if (val < min) {
            s2.push(val);
        }

    }
    public int popValue() {
        int poppedVal = s1.pop();
        if (poppedVal == s2.peek()) {
            s2.pop();
        }
        return poppedVal;
    }


}
