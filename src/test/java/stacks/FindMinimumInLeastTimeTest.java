package stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Stack;

public class FindMinimumInLeastTimeTest {

    private Stack<Integer> s1;
    private Stack<Integer> s2;
    FindMinimumInLeastTime findMinimumInLeastTime;

    @BeforeEach
    public void setup() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        findMinimumInLeastTime = new FindMinimumInLeastTime(s1, s2);
        findMinimumInLeastTime.pushValue(10);
        findMinimumInLeastTime.pushValue(6);
        findMinimumInLeastTime.pushValue(20);
        findMinimumInLeastTime.pushValue(25);
        findMinimumInLeastTime.pushValue(5);
    }

    @Test
    public void popValueTest() {
        findMinimumInLeastTime.popValue();
        Assertions.assertEquals(findMinimumInLeastTime.findMinimum(), 6);
    }

    @Test
    public void findMinimumTest() {
        Assertions.assertEquals(findMinimumInLeastTime.findMinimum(), 5);
    }


}
