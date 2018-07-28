# data-structures-and-algorithms
Whiteboarding Challenges

# Linked List Insertions
Using the self generated Linked List class and Node properties  (no built in methods) write a series of methods to append, insert a new value before something and insert a new value after something.

## Challenge
See summary above. Working with linked lists to understand their properties and uses.

## Solution
In this challenge, I whiteboarded on paper and then coded in the IDE.
I also built a test that properly tests the function for several uses cases.


~~~~~~~~~~~~~~~~~~~~~~~
LAB DOCUMENTATION
Code Challenge
Linked list insertions.

Specifications
Read all of the following instructions carefully. Name things exactly as described, or you will get a ZERO without comment
Do all your work in a public repository called data-structures-and-algorithms, with a well-formated, detailed top level README.md matching the example provided by your instructor
Create a branch in your repository called ll_insertions
On your branch, create…
C#: Create a method named Insertion() outside of Main() in your Program.cs file. Call Your newly created method in Main() once complete.
JavaScript: a file called ll_insertions.js
Python: a file called ll_insertions.py
Include any language-specific configuration files required for this challenge to become an individual component, module, library, etc.
NOTE: You can find an example of this configuration for your course in your class lecture repository.
Feature Tasks
Write the following methods for the Linked List class:

.append(value) which adds a new node with the given value to the end of the list
.insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
.insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node
You have access to the Node class and all the properties on the Linked List class.

Examples
.append(value)
Input	Args	Output
head -> [1] -> [3] -> [2] -> X	5	head -> [1] -> [3] -> [2] -> [5] -> X
head -> X	1	head -> [1] -> X
.insertBefore(value, newVal)
Input	Args	Output
head -> [1] -> [3] -> [2] -> X	3, 5	head -> [1] -> [5] -> [3] -> [2] -> X
head -> [1] -> [3] -> [2] -> X	1, 5	head -> [5] -> [1] -> [3] -> [2] -> X
head -> [1] -> [2] -> [2] -> X	2, 5	head -> [1] -> [5] -> [2] -> [2] -> X
head -> [1] -> [3] -> [2] -> X	4, 5	Exception
.insertAfter(value, newVal)
Input	Args	Output
head -> [1] -> [3] -> [2] -> X	3, 5	head -> [1] -> [3] -> [5] -> [2] -> X
head -> [1] -> [3] -> [2] -> X	2, 5	head -> [1] -> [3] -> [2] -> [5] -> X
head -> [1] -> [2] -> [2] -> X	2, 5	head -> [1] -> [2] -> [5] -> [2] -> X
head -> [1] -> [3] -> [2] -> X	4, 5	Exception
Structure and Testing
Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

Write at least three test assertions for each method that you define.

Ensure your tests are passing before you submit your solution.

Stretch Goal
Once you’ve achieved a working solution, write an additional method to delete a node with the given value from the linked list.

Documentation: Your README.md
# Linked List Insertions
<!-- Short summary or background information -->

## Challenge
<!-- Description of the challenge -->

## Solution
<!-- Embedded whiteboard image -->

Submission Instructions
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