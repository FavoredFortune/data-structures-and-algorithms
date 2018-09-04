# data-structures-and-algorithms
Whiteboarding Challenges

# MergeLinkedLists
Write a method for the Linked List class which takes a number, k, as a parameter. Return the node that is k from the end of the linked list. You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges. ​

## Challenge
See summary above. Working with linked lists to understand their properties and uses.

## Solution
In this challenge, I white boarded on paper and then coded in the IDE.

![Whiteboard 9](https://github.com/FavoredFortune/data-structures-and-algorithms/blob/master/assets/Whiteboard9.png)


I also built a test that properly tests the function for several uses cases.

##Credit
Thanks to classmates Panos Kumasaka, Ahmed Ossan and Brandon Fenty. Both Panos and Ahmed helped me understand the two
 pointer racing approach and Brandon's code helped me fix my for loop to a while loop with improved conditionals:
 
     //my original attempt had a for loop with two conditionals but one was incorrect
             //thanks to classmate Brandon Fenty for reference to his solution at
             //https://github.com/brandon-fenty/data-structures-and-algorithms/blob/master/src/day09/HasLoop.java

------------------------
#LAB DOCUMENTATION
#Code Challenge
​Identify if a linked List has a loop.

# Linked List loop detection
- Check to see if a linked list has circular reference (a loop).

## Challenge

- Create a method that accepts no arguments and returns a boolean
- If a circular reference is detected, return true, otherwise return false
- Make sure that the method does not break if it is applied to a list without a loop in it.
