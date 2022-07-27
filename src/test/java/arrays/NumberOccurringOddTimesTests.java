package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOccurringOddTimesTests {
    @Test
    public void numberOccurringOddTimesTest() {
        int[] arr = {3,2,1,2,3,1,1};
        Assertions.assertEquals(NumberOccurringOddTimes.numberOccurringOddTimes(arr), 1);
    }
    @Test
    public void numberOccurringOddTimesHashTest () {
        int[] arr = {3,2,1,2,3,1,1};
        Assertions.assertEquals(NumberOccurringOddTimes.numberOccurringOddTimesHash(arr), 1);
    }
}
