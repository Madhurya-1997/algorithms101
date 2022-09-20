package trees;


/**
 * A tree is defined to be an inversion of another tree if either:
 *
 * Both trees are null
 * Its left and right children are optionally swapped and its left and right subtrees are inversions.
 * Given binary trees source and target,
 * return whether there's some inversion T of source such that it's a
 * subtree of 'target'. That is, whether there's a node in 'target' that is identically same in values
 * and structure as T including all of its descendants.
 */

class Tree {
    int val;
    Tree left;
    Tree right;
    Tree(int val) {this.val = val;}
}
public class InvertedSubtree {

    private void invert(Tree t) {
        while (t != null) {
            Tree temp = t.left;
            t.left = t.right;
            t.right = temp;
        }
    }

    private boolean isIdentical(Tree a, Tree b) {
        if (a == null && b == null) return true;
        return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
    }

    public boolean solve(Tree source, Tree target) {
        if (source == null && target == null)   return true;

        if (source != target) {
            while (source != target.left && target != null){
                target = target.left;
            }
            while(source != target.right && target != null) {
                target = target.right;
            }

            if (source == target) {
                invert(target);
                return isIdentical(source, target);
            }

        }

        return false;
    }
}
