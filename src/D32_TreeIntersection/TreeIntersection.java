
package D32_TreeIntersection;

import D16_FizzBuzzTree.tree.BinaryTree;
import D16_FizzBuzzTree.tree.TreeNode;


import java.util.*;

public class TreeIntersection {

    public TreeNode root;


    public static Set<Integer> sharedValues (TreeNode nodeOne, TreeNode nodeTwo){

        //creating two sets to hold values from both trees
        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo = new HashSet<>();

        //use a recursive function to traverse both trees given a node
        //from the input parameters of this method
        inOrderTraversal(setOne, nodeOne);
        inOrderTraversal(setTwo, nodeTwo);

        //Compare the second set against the first set
        //review of retains all in lecture and in Java Docs
        //https://docs.oracle.com/javase/7/docs/api/java/util/Set.html#retainAll(java.util.Collection)
        setOne.retainAll(setTwo);

        return setOne;
    }

    //refresher from Geeks for Geeks
    //https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
    private static Set<Integer> inOrderTraversal(Set set, TreeNode node){

        //immediatly address null node case
        if(node == null) {
            return set;
        }

        //reverse tree recursively using an inOrder method
        inOrderTraversal(set, node.left);
        set.add(node.data);
        inOrderTraversal(set, node.right);

        return set;
    }

}