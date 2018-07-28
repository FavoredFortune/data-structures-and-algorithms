package D14_Stack_Max;
import java.util.Stack;

public class MaximumStack extends Stack {

     public int max(){
        MaximumStack copyStack= new MaximumStack();
        int max = 0;

        //implementation of "this" not working
        //make sure stack isn't empty, must return 0 because this is a int method
        if(this.isEmpty()){
            return 0;
        }

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

        //refill orginal stack with values in order
         while(!copyStack.isEmpty()){

         }



    }



}
