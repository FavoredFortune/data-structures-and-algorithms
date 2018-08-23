package D32_TreeIntersection;

import D16_FizzBuzzTree.tree.BinaryTree;
import D16_FizzBuzzTree.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeIntersection {

    public LinkedList sharedValues(BinaryTree treeOne, BinaryTree treeTwo){

         List treeOne = new LinkedList();

         List sharedValues = new LinkedList();


    }

    public LinkedList breadthFirstTraversal(TreeNode node){
        List result = new ArrayList();
        LinkedList helper = new LinkedList();

        //account for empty tree case
        if(node == null){
            return null;
        }

        helper.add(node.data);

        while(!helper.isEmpty()){
            int temp = (int) helper.poll();
            result.add(temp);

            if


        }


    }


}
