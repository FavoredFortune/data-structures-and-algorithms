package D18_FindMaxValueBinaryTree;

import D16_FizzBuzzTree.tree.BinaryTree;
import D16_FizzBuzzTree.tree.TreeNode;

public class FindMax {
    public TreeNode root;
    private int maxValue = Integer.MIN_VALUE;

    public int findMax() {
        int result = this.findMax(this.root);
        return result;
    }

    private int findMax(TreeNode node) {
        TreeNode current = node;

        if (current == null) {
            return maxValue;
        }
        //realized need to traverse just left of tree
        //then just the right of the tree, then compare those
        //two values based on class review and review of Ahemd's code

        int leftMax = this.findMax(current.left);
        int rightMax = this.findMax(current.right);
        int compare = Math.max(leftMax, rightMax);

        return Math.max(node.data, compare);
    }
}
