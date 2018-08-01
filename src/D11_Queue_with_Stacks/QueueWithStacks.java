//package D11_Queue_with_Stacks;
//import java.util.Queue;
//import D06_Insertions.ListNode;
//
//import java.lang.reflect.Array;
//import java.util.*;
//
//public class QueueWithStacks{
//
//    //originally tried instantiating Queues didn't work
//    //Thanks to GB (Timothy Busch) and this original work I learned
//    //to instantiate Stacks first
//    //https://algs4.cs.princeton.edu/13stacks/QueueWithTwoStacks.java.html
//    //Got stuck on opening block and found above link to help understand the two instance QueueWithStacks
//
//    private Stack<Integer> stackA;
//    private Stack<Integer> stackB;
//
//    public QueueWithStacks(){
//        this.stackA = new Stack<>();
//        this.stackB = new Stack<>();
//    }
//
//    //for testing and other possible print needs,
//    //makes Queues print out in easy-to-read format for humans
//    // technically this overrides the built in String Object/Class
//    // that is a subclass of Object in Java
//
//    //Thanks to Ahmed Ossan and Amy Cohen for discussion of
//    // comparing Arrays or Strings for testing
//
//    @Override
//    public String toString(){
//       String result = stackA.toString();
//       return result;
//    }
//
//     public void enqueue(int value){
//       stackA.push(value);
//    }
//
//    //changed to Integer from int because int is a primitive type that can't be null
//    //but Integer is an Object and can have a null value
//    //Thanks to StackOverflow:
//    // https://stackoverflow.com/questions/22777568/why-int-cant-be-compared-to-null-but-integer-can-be-compared-to-null
//
//    public Integer dequeue(){
//        Integer result;
//
//        //handles empty test case
//        if(stackA.isEmpty()){
//            System.out.println("Stack is empty");
//            result = null;
//            return result;
//        }
//        //when the first stack isn't empty use it to take the element
//        //at the top of Stack A and push it into Stack B
//        while (!stackA.isEmpty()){
//            stackB.push(stackA.pop());
//        }
//        //then return the new stack with the last value popped off (full dequue)
//        result = stackB.pop();
//
//        //in opposite scenario, when second stack isn't empty follow the same
//        // process as above with Stack A
//        while(!stackB.isEmpty()){
//            stackA.push(stackB.pop());
//        }
//        return result;
//    }
//
//
//
//
//}