//package D17_BreadthFirstTraversal;
//
//import D16_FizzBuzzTree.tree.BinaryTree;
//import D16_FizzBuzzTree.tree.TreeNode;
//import org.junit.jupiter.api.Test;
//import static org.junit.Assert.*;
//
//public class BreadthFirstTest {
//
//    @Test
//    public void breadthFirstTraversalTest() {
//        BreadthFirst tree = new BreadthFirst();
//        TreeNode n53 = new TreeNode(53);
//
//        TreeNode n18 = new TreeNode(18);
//        TreeNode n12 = new TreeNode(12);
//        TreeNode n24 = new TreeNode(24);
//
//        TreeNode n75 = new TreeNode(75);
//        TreeNode n66 = new TreeNode(66);
//        TreeNode n99 = new TreeNode(99);
//
//        // connect nodes
//        tree.root = n53;
//        n53.left = n18;
//        n18.left = n12;
//        n18.right = n24;
//
//        n53.right = n75;
//        n75.left = n66;
//        n75.right = n99;
//
//        String actual = tree.breadthFirstTraversal();
//        String expected = "\n53\n18\n75\n12\n24\n66\n99\n";
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void breadthFirstTraversalTinyTreeTest() {
//        BreadthFirst tinytree = new BreadthFirst();
//        TreeNode n6= new TreeNode(6);
//
//        TreeNode n5= new TreeNode(5);
//        TreeNode n4 = new TreeNode(4);
//        TreeNode n3 = new TreeNode(3);
//
//        TreeNode n1 = new TreeNode(1);
//        TreeNode n2= new TreeNode(2);
//        TreeNode n7 = new TreeNode(7);
//
//        // connect nodes
//        tinytree.root = n6;
//        n6.left = n5;
//        n5.left = n7;
//        n5.right = n2;
//
//        n6.right = n3;
//        n3.left = n1;
//        n3.right = n4;
//
//        String actual = tinytree.breadthFirstTraversal();
//        String expected = "\n6\n5\n3\n7\n2\n1\n4\n";
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void breadthFirstTraversalOneTest() {
//        BreadthFirst oneTree = new BreadthFirst();
//        TreeNode n6= new TreeNode(6);
//
//        // connect nodes
//        oneTree.root = n6;
//
//        String actual = oneTree.breadthFirstTraversal();
//        String expected = "\n6\n";
//
//        assertEquals(expected, actual);
//    }
//}