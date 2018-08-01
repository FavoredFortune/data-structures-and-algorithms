package D17_BreadthFirstTraversal;

import D16_FizzBuzzTree.tree.TreeNode;

import javax.xml.soap.Node;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

//help for this code from lecture, Geeks for Geeks:
//https://www.geeksforgeeks.org/level-order-tree-traversal/
///TAs, Instructor and classmate, Ahmed Ossan

public class BreadthFirst {

    //instantiate TreeNode from other Whiteboard
    // (after making it's properties public)
    //so have access to the left, right and data properties of a TreeNode
    //that is known to me (built in Nodes had too many different options
    //I don't yet understand.
   TreeNode root;

   //public part of recursive method pair
    public String breadthFirstTraversal(){

        return breadthFirstTraversal(this.root);
    }

    //private part of recursive method pair
    private String breadthFirstTraversal(TreeNode node){
        //immediatly address null node case
        if(node == null) {
            return null;
        }

        //instantiate helper queue that is empty to hold a node and it's children
        //temporarily to print out each node as visited
        Queue<TreeNode> helperQueue = new LinkedList<>();

        //add the node argument passed in to the empty helper queue
        helperQueue.add(node);
        String result = "\n";

        while(!helperQueue.isEmpty()) {

            //take the current node at the front of the queue for printing
            TreeNode temp = helperQueue.poll();
            result += temp.data + "\n";

            //add left child of temp node to queue for print out
            if (temp.left != null) {
                helperQueue.add(temp.left);
            }

            //add right child of temp node to queue for print out
            if (temp.right != null) {
                helperQueue.add(temp.right);
            }
        }
        return result;
    }
}

