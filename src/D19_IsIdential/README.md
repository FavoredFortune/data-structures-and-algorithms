# Overview

Create a method that determines if two BinaryTrees are identical. Assume all values are whole positive integers. 

## Challenge
Build a new method that finds two Binary Trees are identical (not just same values, but same nodes and node locations).

## Solution
In this challenge, I white boarded on my tablet and then coded in the IDE.

![Whiteboard 19 image](/Users/sooz/codefellows/401Java/data-structures-and-algorithms/assets/Whiteboard19.png)

I also built a test that properly tests the function for several uses cases.

---------------------- 

#DOCUMENTATION
##Code Challenge
Determine if two Binary Trees have identical structures.

##Specifications
Read all of the following instructions carefully. Name things exactly as described, or you will get a ZERO without comment
Do all your work in a public repository called data-structures-and-algorithms, with a well-formated, detailed top level README.md matching the example provided by your instructor
Create a branch in your repository called is-identical
On your branch, create…
Java: Create a method named isIdentical attached to your BinaryTree class.
C#: Create a method named isIdentical() outside of Main() in your Program.cs file. Call Your newly created method in Main() once complete.
JavaScript: a file called is-identical-binary-tree.js
Python: a file called is_identical_binary_tree.py
Include any language-specific configuration files required for this challenge to become an individual component, module, library, etc.
NOTE: You can find an example of this configuration for your course in your class lecture repository.

##Feature Tasks
Create a new method on your BinaryTree class called isIdentical that accepts a reference to another BinaryTree and returns true if the two trees have an identical structure. You may assume each BinaryTree only stores data of type int and is not generic.

Trees are considered identical if nodes are in the same positions, and data values are identical. You should be able to traverse the two trees stepping left and right simultaneously, having the same data value along the way without any problems. If one tree ever has a node where the other tree does not or one node has data not matching the other tree then you know the trees are not identical.

You have three options for constructing your Binary Trees for testing:

Wire nodes and the root manually

Use your own .add() method

Use the following .add() method in case you don’t have your own

// adds nodes so the tree is always complete.
// fills the tree top to bottom, left to right.
public void add(int value) {
  TreeNode newNode = new TreeNode(value);
  if (this.root == null) {
    this.root = newNode;
    return;
  }

  // create a queue to do a breadth-first traversal
  Queue<TreeNode> qq = new LinkedList<>();
  qq.add(this.root);

  // keep track of if a node has been added
  // and perform the breadth-first traversal
  boolean isAdded = false;
  while (!isAdded) {
    TreeNode current = qq.poll();
    if (current.left == null) {
      current.left = newNode;
      isAdded = true;
    } else if (current.right == null) {
      current.right = newNode;
      isAdded = true;
    } else {
      if (current.left != null) {
        qq.add(current.left);
      }
      if (current.right != null) {
        qq.add(current.right);
      }
    }
  }
}

##Structure and Testing
Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

Write at least three test assertions for each method that you define.

Ensure your tests are passing before you submit your solution.

##Example
###Input
t01  (empty tree)
t02  (empty tree)

t1  8
   / \
  2   6

t2  8
   / \
  2   6

t3  8
   / \
  2   6
     /
    7
###Output
t01.isIdentical(t02) // true (empty trees are identical to each other)
t1.isIdentical(t2)   // true
t1.isIdentical(t3)   // false



##Submission Instructions
Take a photo of your completed whiteboard, matching the example whiteboard layout
Copy your photo into an /assets directory in your repo
Give the image file the same name as the branch you are working on
Embed the image in your README.md documentation
Create a pull request from your branch to your master branch
In your open pull request, leave as a comment a checklist of the specifications and tasks above, with the actual steps that you completed checked off
Submitting your completed work to Canvas:
Copy the link to your open pull request and paste it into the corresponding Canvas assignment
Leave a description of how long this assignment took you in the comments box
Add any additional comments you like about your process or any difficulties you may have had with the assignment
Merge your branch into master, and delete your branch (don’t worry, the PR link will still work)