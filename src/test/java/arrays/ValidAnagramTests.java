package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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

    @Test
    public void tryAssert1()  {
        Assertions.assertEquals(30,Integer.parseInt("30"));
    }
    @Test
    public void tryAssert2()  {
        Assertions.assertEquals("Five", "FivE");
    }
    @Test
    public void tryAssert3()  {
        Assertions.assertEquals(new Date().getYear(), new GregorianCalendar().get(Calendar.YEAR));
    }
}
