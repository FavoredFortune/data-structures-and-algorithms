# Overview

Create a method that joins two hashmaps as a LEFT join (like in SQL)

## Challenge
Build a new method that returns a single hashmaps with a single set of keys and values from both provided hashtables. 

## Solution
In this challenge, I white boarded on my tablet and then coded in the IDE.


**External view**
![Whiteboard 33 image](https://github.com/FavoredFortune/data-structures-and-algorithms/blob/master/assets/Whiteboard33.jpg)

**Internal Editor file view**
![Whiteboard 33 image](/Users/sooz/codefellows/401Java/data-structures-and-algorithms/assets/Whiteboard33.jpg)

I also built a test that properly tests the function for several uses cases.

---------------------- 

#DOCUMENTATION
#Code Challenge

Implement a simplified LEFT JOIN for 2 Hashmaps.

##Specifications
Read all of the following instructions carefully. Name things exactly as described, or you will get a ZERO without comment
Do all your work in a public repository (matching the example provided by your instructor) called data-structures-and-algorithms, with a well-formatted, detailed top-level README.md
Create a branch in your repository called left_join
On your branch, create…
C#: In your Program.cs file, create a method named LeftJoin(), and call it inside of Main()
JavaScript: a file called left_join.js
Python: a file called left_join.py
Java: a file called LeftJoin.java
Include any language-specific configuration files required for this challenge to become an individual component, module, library, etc.
NOTE: You can find an example of this configuration for your course in your class lecture repository.

##Feature Tasks
Write a function that LEFT JOINs two hashmaps into a single data structure.
The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.
The returned data structure that holds the results is up to you. It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic.
Avoid utilizing any of the library methods available to your language.

##Structure and Testing
Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

Write at least three test assertions for each method that you define.

Ensure your tests are passing before you submit your solution.

##Example
input-output

##Stretch Goals
Consider a RIGHT JOIN. Can you implement this as a new function? How about by passing an optional parameter to your initial function, to speficy if LEFT JOIN or RIGHT JOIN logic should be used?

##Submission Instructions
Take a photo of your completed whiteboard, matching the example whiteboard layout
Copy your photo into an /assets directory in your repo
Give the image file the same name as the branch you are working on
Embed the image in your README.md documentation
Create a pull request from your branch to your master branch
In your open pull request, leave as a comment a checklist of the specifications and tasks above, with the actual steps that you completed checked off

##Submitting your completed work to Canvas:
Copy the link to your open pull request and paste it into the corresponding Canvas assignment
Leave a description of how long this assignment took you in the comments box
Add any additional comments you like about your process or any difficulties you may have had with the assignment
