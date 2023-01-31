package linkedlist;

import linkedlist.MyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyLinkedListTests {

    private MyLinkedList linkedList;

    @BeforeEach
    public void setUp() {
        linkedList = new MyLinkedList();
    }

    @Test
    public void addFrontTest() {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);
        Assertions.assertEquals(1, linkedList.getLast());
        Assertions.assertEquals(3, linkedList.getFirst());

    }

    @Test
    public void getFirstTest() {
        linkedList.addFront(1);
        Assertions.assertEquals(1, linkedList.getFirst());
    }

    @Test
    public void getLastTest() {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);
        Assertions.assertEquals(1, linkedList.getLast());
    }

    @Test
    public void addBackTest() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);
        Assertions.assertEquals(3, linkedList.getLast());
    }

    @Test
    public void sizeTest() {
        Assertions.assertEquals(0, linkedList.getSize());

        linkedList.addBack(1);
        Assertions.assertEquals(1, linkedList.getSize());

        linkedList.addBack(2);
        Assertions.assertEquals(2, linkedList.size());

        linkedList.addBack(3);
        Assertions.assertEquals(3, linkedList.size());

    }

    @Test
    public void clearTest() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);
        linkedList.clear();
        Assertions.assertEquals(0, linkedList.size());
    }

    @Test
    public void deleteValueTests() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);
        linkedList.deleteValue(2);

        Assertions.assertEquals(2, linkedList.size());

    }

    @Test
    public void detectCycleTest() {

    }

}

