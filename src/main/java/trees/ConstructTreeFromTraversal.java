package trees;


class BTNode {
    int val;
    BTNode left;
    BTNode right;
    BTNode(int val) {this.val = val;}
}

public class ConstructTreeFromTraversal {
    public static void main(String[] args) {
        String a = "foo";
        System.out.println(a.indexOf("o"));
    }
    /**
     * Given two integer arrays inorder and postorder
     * where inorder is the inorder traversal of a binary tree
     * and postorder is the postorder traversal of the same tree,
     * construct and return the binary tree.
     */
    public BTNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeUtil(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
    }

    private BTNode buildTreeUtil(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd) {
            return null;
        }

        BTNode node = new BTNode(postorder[postEnd]);
        if (inStart == inEnd) {
            return node;
        }

        int nodeIdx = search(inorder, inStart, inEnd, node.val);

        node.right = buildTreeUtil(inorder, postorder, nodeIdx+1, inEnd, postEnd - inEnd + nodeIdx, postEnd-1);
        node.left = buildTreeUtil(inorder, postorder, inStart, nodeIdx-1, postStart, postStart - inStart + nodeIdx - 1);

        return node;
    }
    private int search(int[] arr, int s, int e, int target) {
        for (int i=s; i<=e; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
