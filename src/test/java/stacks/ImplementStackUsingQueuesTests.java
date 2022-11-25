package stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueuesTests {

    private Queue<Integer> q1;
    private Queue<Integer> q2;
    ImplementStackUsingQueues<Integer> integerImplementStackUsingQueues;

    @BeforeEach
    public void setup() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        integerImplementStackUsingQueues = new ImplementStackUsingQueues<>(q1, q2);
        integerImplementStackUsingQueues.push(1);
        integerImplementStackUsingQueues.push(2);
        integerImplementStackUsingQueues.push(3);
        integerImplementStackUsingQueues.push(4);
        integerImplementStackUsingQueues.push(5);
    }

    @Test
    public void pushTest() {
        integerImplementStackUsingQueues.push(10);
        integerImplementStackUsingQueues.printStack();
    }

    @Test
    public void popTest() {
        Integer expected = integerImplementStackUsingQueues.pop();
        Assertions.assertEquals(expected, 5);
        integerImplementStackUsingQueues.printStack();
    }

}
