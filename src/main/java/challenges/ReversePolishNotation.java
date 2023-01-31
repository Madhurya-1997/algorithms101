package challenges;

import java.util.Stack;

public class ReversePolishNotation {
    /**
     * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
     *
     * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
     *
     * Note that division between two integers should truncate toward zero.
     *
     * It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.
     *
     *
     * ["2","1","+","3","*"]
     * output: 9
     * ((2 + 1) * 3) = 9
     *
     *
     * ["4","13","5","/","+"]
     * 6
     * (4 + (13 / 5)) = 6
     *
     */
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s: tokens) {
            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                stack.push(-stack.pop() + stack.pop());
            } else if (s.equals("*")){
                stack.push(stack.pop() * stack.pop());
            } else if (s.equals("/")){
                if (stack.peek() == 0) {
                    break;
                }
                int top = stack.pop(); // 3
                int bottom = stack.pop(); // 5
                int temp = top;
                top = bottom;
                bottom = temp;
                stack.push(top/bottom);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();

    }
}
