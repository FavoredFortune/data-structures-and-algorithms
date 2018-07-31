package D16_FizzBuzzTree;

//built off my original work on FizzBuzz and class lecture review related to problem

//doesn't work with String object - need to review this again and figure it out.
public class FizzBuzzTree {

    public String fizzBuzzTree(StringBuilder string){
        for(int i = 0 ; i >string.length(); i++){

            if (i % 3 == 0 && i % 5 == 0){
                char temp = string.charAt(i);
                string.append("fizz buzz");
            } else if(i % 5 == 0){
                char temp = string.charAt(i);
                string.append("buzz");
            } else if (i % 3 == 0){
                char temp = string.charAt(i);
                string.append("fizz");
            } else {
                string.append(i);
            }
        } return string.toString();
    }
}
