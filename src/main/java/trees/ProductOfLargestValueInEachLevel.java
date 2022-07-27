package trees;


import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Given a binary tree return the product of
 * the largest value in each level of the tree
 *
 *              10
 *             /  \
 *            3    4
 *           / \  / \
 *          7  10 12 9
 *         /     / \
 *        1     24  3
 *       /
 *      12
 *
 *      Result = 10 * 4 * 12 * 24 * 12
 *
 *      if root is null, return 0
 */

class Node {
    int val;
    Node left;
    Node right;
    Node (int val) {
        this.val = val;
    }
}

public class ProductOfLargestValueInEachLevel {
    /**
     *    use BFS since this will be a level by level search
     *    with queue and keep track of a running product variable.
     *    At end of each level, multiply running product with largest data on that level
      */

//
//    public static long binaryTreeProduct(Node root) {
//        if (root == null) return 0;
//
//        Queue<Node> queue = new PriorityQueue<>();
//    }
}
