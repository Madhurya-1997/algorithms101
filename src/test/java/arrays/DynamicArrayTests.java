package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class DynamicArrayTests {

    private DynamicArray<String> arr;

    @BeforeEach
    public void setUp() {
        arr = new DynamicArray<String>(4);
    }

    @Test
    public void getAndSetTest() {
        arr.set(0, "a");
        Assertions.assertEquals("a", arr.get(0));
    }

    @Test
    public void insertTest() {
        arr.set(0, "a");
        arr.set(1, "c");
        arr.set(2, "d");

        arr.insert(1, "b");

        Assertions.assertEquals(4, arr.getSize());
        Assertions.assertEquals("a", arr.get(0));
        Assertions.assertEquals("b", arr.get(1));
        Assertions.assertEquals("c", arr.get(2));
        Assertions.assertEquals("d", arr.get(3));


    }

    @Test
    public void deleteTest() {
        arr.set(0, "a");
        arr.set(1, "b");
        arr.set(2, "c");
        arr.set(3, "d");

        arr.delete(1);

        Assertions.assertEquals(3, arr.getSize());
        Assertions.assertEquals("a", arr.get(0));
        Assertions.assertEquals("c", arr.get(1));
        Assertions.assertEquals("d", arr.get(2));
    }

    @Test
    public void isEmptyTest() {
        Assertions.assertEquals(true, arr.isEmpty());
    }

    @Test
    public void isNotEmptyTest() {
        arr.set(0, "Hello");
        Assertions.assertEquals(false, arr.isEmpty());

    }

    @Test
    public void containsTest() {
        arr.set(0, "algo");
        Assertions.assertEquals(true, arr.contains("algo"));
        Assertions.assertEquals(false, arr.contains("algo2"));

    }


}

