# Overview

Create a method that flips all the right and left nodes of a tree. Assume all values are whole positive integers. 

## Challenge
Build a new method that swaps the node values of each right and left branch of each node throughout a tree. 

## Solution
In this challenge, I white boarded on my tablet and then coded in the IDE.

![Whiteboard 20 image](/Users/sooz/codefellows/401Java/data-structures-and-algorithms/assets/Whiteboard20.png)

I also built a test that properly tests the function for several uses cases.

---------------------- 

#DOCUMENTATION
##Code Challenge
Flip a Binary Tree so all it’s left and right nodes are swapped.

##Specifications
- Read all of the following instructions carefully. Name things exactly as described, or you will get a ZERO without comment
- Do all your work in a public repository called `data-structures-and-algorithms`, with a well-formated, detailed top level README.md matching the example provided by your instructor
- Create a branch in your repository called `flip-binary-tree`
- On your branch, create...
    - _Java_: Create a method named `flip` attached to your `BinaryTree`
      class.
    - _C#_: Create a method named `flip()` outside of `Main()` in your `Program.cs` file. Call Your newly created method in `Main()` once complete. 
    - _JavaScript_: a file called `flip-binary-tree.js`
    - _Python_: a file called `flip_binary_tree.py`
- Include any language-specific configuration files required for this challenge to become an individual component, module, library, etc.
    - _NOTE: You can find an example of this configuration for your course in your class lecture repository._

##Feature Tasks
Traverse through a binary tree and swap each right and left value.

Hint: consider this incomplete pseudocode:

```
recurse(node):
  newLeft = recurse(node.right)
  node.right = recurse(node.left)
  node.left = newLeft
  return node
```

## Structure and Testing
Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

Write at least three test assertions for each method that you define.

Ensure your tests are passing before you submit your solution.

## Example

### Input
```
    8
   / \
  2   6
     /
    7
     \
      1
```

### Output
```
    8
   / \
  6   2
   \  
    7
   /
```

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