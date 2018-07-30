package D13_MultiBracketValidation;

import java.util.Stack;

public class MultiBracketValidation {

    //instantiate holder stacks for sorting
    public static Stack<String> curly = new Stack<>();
    public static  Stack<String> bracket = new Stack<>();
    public static  Stack<String> parens = new Stack<>();
    public static Stack<String> other = new Stack<>();

    public static boolean multiBracketValidation(Stack<String> input){
        Stack<String> original = input;

        //apply helper method with helper method to execute main intended method
        return bracketSort(original);
    }

    public static boolean bracketSort(Stack<String> input) {
        int size = input.size();

        //rule out empty case
        if (size == 0) {
            return true;
        }

        //while the original string stack isn't empty do the following
        while (size > 0) {

            //evalute the first item in the input string stack
            String temp = input.pop();

            //sort into various stacks by character type
            if (temp == "{" || temp == "}") {
                curly.push(temp);
            } else if (temp == "[" || temp == "]") {
                bracket.push(temp);
            } else if (temp == "(" || temp == ")") {
                parens.push(temp);
            } else {
                other.push(temp);
            }
        }

        //evaluate with secondary helper method if each character bracket type is matched/even
        if (curly.matched() == true && bracket.matched() == true && parens.matched() == true) {
            return true;
        } else {
            return false;
        }
    }

    //see with helper method if each character bracket type is matched/even
    public static boolean matched(){
        boolean match = false;
        while (match) {
            if (curly.size() % 2 == 0 && bracket.size() % 2 == 0 && parens.size() % 2 == 0) {
                match = true;
            } else {
                match = false;
            }
        }
        return match;
    }

}


