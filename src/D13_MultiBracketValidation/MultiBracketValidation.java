package D13_MultiBracketValidation;

import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){

        //per class review, nixed additional stack method approach
        //using single stack in single method
        //like cohort member, Brandon Fenty
        Stack<Character> inputString = new Stack<>();

        boolean result = true;

        //adding back in for edge case of empty string
        // but with different method based on lecture review
        if(input.isEmpty()){
            return result;
        }

        /*
        while the original string isn't empty
        go through the string this way
        */
        for(int i = 0; i < input.length(); i++){

            //instantiate a variable for the first item in the input string
            //and to track each character in the string as you move through it
            char temp = input.charAt(i);

            //check for beginning type brackets push back into stack if existing.
            if (temp == '{' || temp == '[' || temp == '(') {
                inputString.push(temp);
            }
            //check for closing type brackets and push back into stack if existing.
            if (temp == '}' || temp == ']' || temp == ')') {
                if (inputString.isEmpty()) {
                    return false;
                }

                //track the new element in the input string stack
                char newChar = inputString.peek();

                //next, compare the first character in the stack with the current character
                //to see if they match or not
                //if the two variables do match pop the character back out of the stack
                if (newChar == '{' && temp == '}' || newChar == '[' && temp == ']' || newChar == '(' && temp == ')') {
                    inputString.pop();
                }
                //but if match isn't found input string isn't balanced in order so return result
                else {
                    return false;
                }

            }
        }
        return result;
    }
}


