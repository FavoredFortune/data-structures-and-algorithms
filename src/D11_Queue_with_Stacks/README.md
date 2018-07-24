# Implement a Queue using two Stacks.
Using only the pop and push Stack methods, create a enqueue and dequeue method for a Queue.

## Challenge
See above

## Solution
In this challenge, I white boarded on my tablet and then coded in the IDE.

![Whiteboard 11 = tb posted]("Whiteboard11")


I also built a test that properly tests the function for several uses cases.

----------------------

DOCUMENTATION

Code Challenge
Implement a Queue using two Stacks.

Specifications
Read all of the following instructions carefully. Name things exactly as described, or you will get a ZERO without comment
Do all your work in a public repository called data-structures-and-algorithms, with a well-formated, detailed top level README.md matching the example provided by your instructor
Create a branch in your repository called queue_with_stacks
On your branch, create…
C#: Create a method named QueueWithStacks() outside of Main() in your Program.cs file. Call Your newly created method in Main() once complete.
JavaScript: a file called queue_with_stacks.js
Python: a file called queue_with_stacks.py
Include any language-specific configuration files required for this challenge to become an individual component, module, library, etc.
NOTE: You can find an example of this configuration for your course in your class lecture repository.
Feature Tasks
Implement the following methods for the Queue class:

enqueue(value) which inserts value into the Queue using a first-in, first-out approach.
dequeue() which extracts a value from the Queue using a first-in, first-out approach.
You have access to 2 Stack instances with push and pop methods.

Structure and Testing
Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

Write at least three test assertions for each method that you define.

Ensure your tests are passing before you submit your solution.

Example
enqueue(value)
Input	Args	Output
[10]->[15]->[20]	5	[5]->[10]->[15]->[20]
 	5	[5]
dequeue()
Input	Output	Internal State
[5]->[10]->[15]->[20]	20	[5]->[10]->[15])
[5]->[10]->[15]	15	[5]->[10]

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
© Code Fellows 2018