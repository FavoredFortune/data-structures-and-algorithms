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

        return bracketSort(original);
    }

    public static boolean bracketSort(Stack<String> input) {
        int size = input.size();
        if (size == 0) {
            return true;
        }
        while (size > 0) {
            String temp = input.pop();
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
        if (curly.matched() == true && bracket.matched() == true && parens.matched() == true) {
            return true;
        } else {
            return false;
        }
    }
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


