package D17_BreadthFirstTraversal;

import D16_FizzBuzzTree.tree.BinaryTree;
import D16_FizzBuzzTree.tree.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class BreadthFirstTest {

    @org.junit.Test
    public void breadthFirstTraversal() {
        BreadthFirst tree = new BreadthFirst();
        TreeNode n53 = new TreeNode(53);

        TreeNode n18 = new TreeNode(18);
        TreeNode n12 = new TreeNode(12);
        TreeNode n24 = new TreeNode(24);

        TreeNode n75 = new TreeNode(75);
        TreeNode n66 = new TreeNode(66);
        TreeNode n99 = new TreeNode(99);

        // connect nodes
        tree.root = n53;
        n53.left = n18;
        n18.left = n12;
        n18.right = n24;

        n53.right = n75;
        n75.left = n66;
        n75.right = n99;

        String actual = tree.breadthFirstTraversal();
        String expected = "\n53\n18\n75\n12\n24\n66\n99\n";

        assertEquals(expected, actual);
    }
}