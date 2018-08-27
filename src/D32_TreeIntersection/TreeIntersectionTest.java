package D32_TreeIntersection;

import D16_FizzBuzzTree.tree.TreeNode;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void sharedValuesEmptyTest() {

        TreeNode node1 = new TreeNode(0);
        TreeNode node2 = new TreeNode(0);

        Set<Integer> expected = new HashSet<>();
        expected.add(0);

        Set<Integer> actual =  new HashSet<>();
        actual.add(0);

        assertEquals(expected, actual);
    }

    @Test
    public void sharedValuesOneSharedTest() {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node1.left = node2;
        node1.right = node3;

        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);

        node4.left = node5;
        node4.right = node6;

        Set<Integer> expected = new HashSet<>();
        expected.add(3);

        Set<Integer> actual = TreeIntersection.sharedValues(node1, node4);

        assertEquals(expected, actual);
    }

    @Test
    public void sharedValuesNoSharingTest() {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node1.left = node2;
        node1.right = node3;

        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        node4.left = node5;
        node4.right = node6;

        Set<Integer> expected = new HashSet<>();

        Set<Integer> actual = TreeIntersection.sharedValues(node1, node4);

        assertEquals(expected, actual);
    }
}