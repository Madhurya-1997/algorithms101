package trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTests {

    private BinarySearchTree tree;

    @BeforeEach
    public void setUp() {
        tree = new BinarySearchTree();

        tree.insert(5, "a");
        tree.insert(3, "b");
        tree.insert(7, "c");
        tree.insert(2, "d");
        tree.insert(4, "e");
        tree.insert(6, "f");
        tree.insert(8, "g");
    }

    @Test
    public void testMin() {
//        Assertions.assertEquals(tree.min());
    }

    @Test
    public void testMax() {

    }
    @Test
    public void testFind() {
        System.out.println(tree.find(5));
        Assertions.assertEquals(tree.find(5), "a");
    }
    @Test
    public void testDeleteNoChildren() {
        tree.delete(4);
        tree.preorder();
    }
    @Test
    public void testDeleteOneChild() {
        tree.delete(4);
        tree.delete(3);
        tree.preorder();
    }
    @Test
    public void testDeleteTwoChildren() {
        tree.delete(7);
        tree.preorder();
    }

    @Test
    public void testLevelOrderTraversal() {
        tree.levelOrderTraversal();
    }

    @Test
    public void testInvertTree() {
        tree.invertTree();
        tree.preorder();
    }
}
