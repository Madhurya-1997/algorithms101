package stacks;

import java.util.Stack;

public class ReverseStack {
    private Stack<Integer> s = new Stack<>();

    public void reverseStack() {
        if (!s.isEmpty()) {
            Integer x = s.pop();
            reverseStack();

            insertAtBottom(x);
        }
    }
    private void insertAtBottom(int x) {
        if (s.isEmpty()) {
            s.push(x);
        } else {
            Integer temp = s.pop();
            insertAtBottom(x);

            s.push(temp);
        }
    }

    public Stack<Integer> getS() {
        return s;
    }

    public void setS(Stack<Integer> s) {
        this.s = s;
    }

}
