package D14_Stack_Max;
import java.util.Stack;

public class MaximumStack extends Stack {

     //Really proud of my method because it's pretty different from what I saw in class
     //yet it still works!
     //This method doesn't take in any parameters and doesn't create two stacks.
     //Instead it using a single stack to build up to find max value then recreate
     //the original stack.
     //Improvements from original whiteboard:
     // * changing max variable to be from a value already within the stack
     // This approach never returns anything that isn't in the stack,
     // rather than an artificial max value set by the method
     //* changing how the rebuild original stack worked to add to the original stack
     // This approach resolved the infinite loop I had.

     //I believe this solution is an O of 1 for space and an O of n for time
     //due to the two while loops.

     public int max(){

        Stack<Integer> copyStack = new Stack<>();

         //resolving edge case of empty stack
         //make sure stack isn't empty, must return 0 because this is a int method
         //this must be the first thing done in the method to avoid a null pointer error
         if(this.isEmpty()){
             return 0;
         }

        //this only works if stack is full
        //moved to be after if statement to avoid null pointer error
        int max = (int) this.peek();

        //use this loop to evaluate each value
        // to find the max while maintaining the original order of the stack
        //in a placeholder, temporary "copy" stack
        //idea from conversation with Ahmed and research on Stack Overflow:
        //https://stackoverflow.com/questions/17841522/how-to-find-the-max-integer-value-in-a-stack-without-using-max-or-iterating-ov
        while(!this.isEmpty()){
            int tempValue = (int) this.pop();
            max = Math.max(tempValue,max);
            copyStack.push(tempValue);
        }

        //refill original stack with values in order
        while(!copyStack.isEmpty()){
         this.push(copyStack.pop());
        }

        return max;
    }

}
