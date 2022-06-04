package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidAnagramTests {

    @Test
    public void isValidAnagramTest1() {
        String s1 = "rat";
        String s2 = "tar";
        boolean expected = ValidAnagram.isAnagram(s1, s2);
        Assertions.assertEquals(expected, true);

    }

    @Test
    public void isValidAnagramTest2() {
        String s1 = "rat";
        String s2 = "tad";
        boolean expected = ValidAnagram.isAnagram(s1, s2);
        Assertions.assertEquals(expected, false);

    }

    @Test
    public void isValidAnagramTest3() {
        String s1 = "rattle";
        String s2 = "tar";
        boolean expected = ValidAnagram.isAnagram(s1, s2);
        Assertions.assertEquals(expected, false);

    }
}
