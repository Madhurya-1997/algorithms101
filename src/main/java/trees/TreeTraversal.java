package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTraversal {
    /**
     * level order traversal
     */
    public List<Integer> levelOrder(Node root) {
        if (root == null) return null;

        List<Integer> res = new ArrayList<>();
        if (root != null) {
            Queue<Node> q = new LinkedList<>();

            Node temp=null;
            q.add(root);
            while (!q.isEmpty()) {
                temp = q.poll();
                res.add(temp.val);
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
        }
        return res;
    }
}
