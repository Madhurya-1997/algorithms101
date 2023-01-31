package stacks;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class ReverseStackTest {
    @Test
    public void reverseStack() {
        ReverseStack reverseStack = new ReverseStack();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        reverseStack.setS(stack);
        System.out.println(stack);
        reverseStack.reverseStack();

        System.out.println(stack);
    }
}
