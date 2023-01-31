package stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Stack;

public class FindMinimumInLeastTimeTest {

    private Stack<Integer> s1;
    FindMinimumInLeastTime findMinimumInLeastTime;

    @BeforeEach
    public void setup() {
        s1 = new Stack<>();
        findMinimumInLeastTime = new FindMinimumInLeastTime(s1);
        findMinimumInLeastTime.pushValueOpt(10);
        findMinimumInLeastTime.pushValueOpt(6);
        findMinimumInLeastTime.pushValueOpt(20);
        findMinimumInLeastTime.pushValueOpt(25);
        findMinimumInLeastTime.pushValueOpt(5);
    }

//    @Test
//    public void popValueOptTest() {
//        int exp = findMinimumInLeastTime.popValueOpt();
//        Assertions.assertEquals(exp, 5);
//    }
    @Test
    public void findMinimumOpt() {
        findMinimumInLeastTime.popValueOpt();
        int exp = findMinimumInLeastTime.findMinimumOpt();
        Assertions.assertEquals(exp, 6);
    }



}
