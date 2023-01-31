package stacks;

import java.util.Stack;

/**
 * Design a Stack such that findMinimum() method runs in O(1)
 */
public class FindMinimumInLeastTime{
    private Stack<Integer> s1; // original stack
    private Stack<Integer> s2; // stack will store the minimum val found so far
    private static int currentMinimum = 0;

    public FindMinimumInLeastTime(Stack<Integer> s1){
        this.s1 = s1;
    }
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


    public void pushValueOpt(int val) { // constant time and space
        if (s1.isEmpty()) {
            s1.push(val);
            currentMinimum = val;
        } else {
            if (val < currentMinimum) {
                s1.push(val - currentMinimum);
                currentMinimum = val;
            } else {
                s1.push(val);
            }
        }
    }
    public int popValueOpt() { // constant time and space
        int poppedValue = -1;
        if (s1.isEmpty()) {
            poppedValue = -1;
        } else {
            if (s1.peek() < 0) {
                // it means the top of stack had the minimum value,
                // currently stored in currentMinimum
                poppedValue = currentMinimum;
                currentMinimum = currentMinimum - s1.peek();
                s1.pop();
            } else {
                poppedValue = s1.pop();
            }
        }
        return poppedValue;
    }

    public int findMinimumOpt() {
        return currentMinimum;
    }
}
