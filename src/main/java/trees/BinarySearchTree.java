package trees;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int key;
    String value;
    TreeNode left;
    TreeNode right;

    TreeNode(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public TreeNode min() {
        if (this.left == null) {
            return this;
        } else {
            return left.min();
        }
    }

}

public class BinarySearchTree {

    TreeNode root;


    /**
     * Find a Node in BST
     */
    public String find (int key) {
        // start from the root node always and use recursion
        TreeNode node = find(root, key);

        return node == null ? null : node.value;

    }

    private TreeNode find (TreeNode node, int key) {
        if (node.key == key || node== null) {
            return node;
        } else if (key > node.key) {
            return find (node.right, key);
        } else {
            return find(node.left, key);
        }
    }


    /**
     * Insert Node in BST
     */
    void insert(int key, String value) {
        // the current node we are in is the root of the BST or sub-BST
        root = insertItem(root, key, value);
    }
    private TreeNode insertItem (TreeNode node, int key, String value) {
        TreeNode newNode = new TreeNode(key, value);

        if (node == null) {
            node = newNode;
            return node;
        }

        if (key < node.key) {
            node.left = insertItem(node.left, key, value);
        } else {
            node.right = insertItem(node.right, key, value);
        }
        return node;
    }


    /**
     * Deleting a Node from BST
     */
    public void delete(int key) {
        root = deleteNode(root, key);
    }

    private TreeNode deleteNode (TreeNode node, int key) {
        if (node == null) {
            return null;
        } else if (key < node.key) {
            node.left = deleteNode(node.left, key);
        } else if (key > node.key) {
            node.right = deleteNode(node.right, key);
        } else {


            // No children
            if (node.left == null && node.right == null) {
                node = null;
            }

            // One child
            else if (node.left == null) {
                node = node.right;
            } else if (node.right == null) {
                node = node.left;
            }

            // Two children
            else {
                // find the min value of node on the right subtree of deleted node
                TreeNode successorNode = findMin(node.right);

                //duplicate the successor node with the deleted node
                node.key = successorNode.key;
                node.value = successorNode.value;

                // delete the successor node
                node.right = deleteNode(node.right, node.key);
            }
        }
        return node;

    }

    private TreeNode findMin(TreeNode node) {
        if (node.left == null && node.right == null) {
            return node;
        } else if (node.right == null) {
            node.left = findMin(node.left);
        } else if (node.left == null) {
            node.right = findMin(node.right);
        }
        return null;
    }


    /**
     * Depth Search
     * 1. Inorder traversal
     * 2. Preorder traversal
     * 1. Postorder traversal
     */
    /**
     * Inorder traversal
     */
    public void inorder() {
        inorderTraversal(root);
    }
    private void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.println(node.key);
            inorderTraversal(node.right);
        }
    }


    /**
     * Preorder traversal
     */
    public void preorder() {
        preorderTraversal(root);
    }
    private void preorderTraversal(TreeNode node) {
        if (node != null) {
            preorderTraversal(node.left);
            System.out.println(node.key);
            preorderTraversal(node.right);
        }
    }


    /**
     * Postorder traversal
     */
    public void postorder() {
        postorderTraversal(root);
    }
    private void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.println(node.key);
        }
    }

    /**
     * Level order traversal
     */
    public void levelOrderTraversal() {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            TreeNode tempNode = q.poll();
            System.out.println(tempNode.key);

            if (tempNode.left != null) {
                q.add(tempNode.left);
            }
            if (tempNode.right != null) {
                q.add(tempNode.right);
            }
        }
    }


    public void invertTree() {
        invertTreeRecursive(root);
    }

    private TreeNode invertTreeRecursive(TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        invertTreeRecursive(node.left);
        invertTreeRecursive(node.right);

        return node;
    }
}
