# Overview

find if different bracket types ("(){}[]") are matched, in a balanced order, in a string or not - return boolean.

## Challenge
Use stacks to test and return true/false

## Solution
In this challenge, I white boarded on my tablet and then coded in the IDE.

![Whiteboard 13](https://github.com/FavoredFortune/data-structures-and-algorithms/blob/master/assets/Whiteboard13.png)

I also built a test that properly tests the function for several uses cases.

----------------------

DOCUMENTATION
Code Challenge
Multi-bracket Validation.

Specifications
Read all of the following instructions carefully. Name things exactly as described, or you will get a ZERO without comment
Do all your work in a public repository (matching the example provided by your instructor) called data-structures-and-algorithms, with a well-formated, detailed top-level README.md
Create a branch in your repository called multi-bracket-validation
On your branch, create…
C#: Create a method named MultiBracketValidation() outside of Main() in your Program.cs file. Call Your newly created method in Main() once complete.
JavaScript: a file called multi-bracket-validation.js
Python: a file called multi_bracket_validation.py
Include any language-specific configuration files required for this challenge to become an individual component, module, library, etc.
NOTE: You can find an example of this configuration for your course in your class lecture repository.
Feature Tasks
On your main file, create…
C#: a function called bool MultiBracketValidation(string input)
JavaScript: a function called multiBracketValidation(input)
Python: a function called multi_bracket_validation(input)
Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:

Round Brackets : ()
Square Brackets : []
Curly Brackets : {}
Structure and Testing
Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

Write at least three test assertions for each method that you define.

Ensure your tests are passing before you submit your solution.

Example
Input	Output
{}	TRUE
{}(){}	TRUE
()[[Extra Characters]]	TRUE
(){}[[]]	TRUE
{}{Code}[Fellows](())	TRUE
[({}]	FALSE
(](	FALSE
{(})	FALSE
Consider these small examples and why they fail.

Input	Output	Why
{	FALSE	error unmatched opening { remaining.
)	FALSE	error closing ) arrived without corresponding opening.
[}	FALSE	error closing }. Doesn’t match opening (.

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