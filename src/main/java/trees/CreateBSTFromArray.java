package trees;


public class CreateBSTFromArray {
    class TreeNode {
        trees.TreeNode left;
        trees.TreeNode right;
        int val;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public void createBSTFromArray(int[] arr, int N) {

        int i=0;
        while (i<N) {
            TreeNode node = new TreeNode(arr[i]);
//            if ()
            if (node.val > arr[i]) {

            }
        }
    }
}
