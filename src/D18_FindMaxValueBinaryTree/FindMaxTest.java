package D18_FindMaxValueBinaryTree;

import D16_FizzBuzzTree.tree.BinaryTree;
import D16_FizzBuzzTree.tree.TreeNode;
import apple.laf.JRSUIUtils;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class FindMaxTest {

    @Test
    public void findMaxTestNegativeNum() {
        FindMax tree = new FindMax();
        TreeNode n53 = new TreeNode(-3);

        TreeNode n18 = new TreeNode(-8);
        TreeNode n12 = new TreeNode(-2);
        TreeNode n24 = new TreeNode(-4);

        TreeNode n75 = new TreeNode(-5);
        TreeNode n66 = new TreeNode(-6);
        TreeNode n99 = new TreeNode(-9);

        // connect nodes
        tree.root = n53;
        n53.left = n18;
        n18.left = n12;
        n18.right = n24;

        n53.right = n75;
        n75.left = n66;
        n75.right = n99;

        int actual = tree.findMax();
        int expected = -2;

        assertEquals(expected, actual);
    }

    @Test
    public void findMaxTinyTreeTest() {
        FindMax tinyTree = new FindMax();
        TreeNode n6= new TreeNode(6);

        TreeNode n5= new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3);

        TreeNode n1 = new TreeNode(1);
        TreeNode n2= new TreeNode(2);
        TreeNode n7 = new TreeNode(7);

        // connect nodes
        tinyTree.root = n6;
        n6.left = n5;
        n5.left = n7;
        n5.right = n2;

        n6.right = n3;
        n3.left = n1;
        n3.right = n4;
        System.out.println(tinyTree);
        int actual  = tinyTree.findMax();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void breadthFirstTraversalOneTest() {
        FindMax oneTree = new FindMax();
        TreeNode n6= new TreeNode(6);

        // connect nodes
        oneTree.root = n6;

       int actual = oneTree.findMax();
       int expected = 6;

        assertEquals(expected, actual);
    }

}